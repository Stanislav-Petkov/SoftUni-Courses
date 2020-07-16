import java.util.ArrayList;
import java.util.List;

public class ExampleValidator {

    private Example exampleToValidate;

    ExampleValidator(Example exampleToValidate) {
        this.exampleToValidate = exampleToValidate;
    }

    public void validate() {
        List<InvalidFieldCause> exceptionList = new ArrayList<>();

        InvalidFieldCause illegalName = validateName();
        if (illegalName != null) {
            exceptionList.add(illegalName);
        }
        InvalidFieldCause illegalAge = validateAge();
        if (illegalAge != null) {
            exceptionList.add(illegalAge);
        }
    }

    private InvalidFieldCause validateAge() {
        if (exampleToValidate.getAge() < 0) {
            return new InvalidFieldCause("Age", "Age cannot be less than 0");
        }
        return null;
    }

    private InvalidFieldCause validateName() {
        if (exampleToValidate.getName().equals("Alice")) {
            return new InvalidFieldCause("name", "Name cannot be Alice!");
        }
        return null;
    }
}
