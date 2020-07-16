package Errors;

public class Main {
    public static void main(String[] args) {
        Example example = new Example("Alice", -12);
        ExampleValidator validator = new ExampleValidator(example);
        validator.validate();
    }
}
