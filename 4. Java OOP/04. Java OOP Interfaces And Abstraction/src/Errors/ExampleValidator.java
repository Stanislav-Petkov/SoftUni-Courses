package Errors;

import java.util.ArrayList;
import java.util.List;

public class ExampleValidator {

    private Example exampleToValidate;

    ExampleValidator(Example exampleToValidate) {
        this.exampleToValidate = exampleToValidate;
    }

    public void validate() {
        List<IllegalArgumentException> exceptionList = new ArrayList<>();
        IllegalArgumentException illegalName = validateName();
        if (illegalName != null) {
            exceptionList.add(illegalName);
        }
        IllegalArgumentException illegalAge = validateAge();
        if (illegalAge != null) {
            exceptionList.add(illegalAge);
        }

        if (!exceptionList.isEmpty()) {
            throw new IllegalArgumentException("Illegal arguments: " + exceptionList);
        }
    }

    private IllegalArgumentException validateAge() {
        if (exampleToValidate.getAge() < 0) {
            return new IllegalArgumentException("Age cannot be less than 0");
        }
        return null;
    }

    private IllegalArgumentException validateName() {
        if (exampleToValidate.getName().equals("Alice")) {
            return new IllegalArgumentException("Name cannot be Alice!");
        }
        return null;
    }
}
