package validPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) throws PersonCreationException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    private boolean myStringIsNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public void setFirstName(String firstName) throws PersonCreationException {
        validateString(firstName);
        this.firstName = firstName;
    }

    private void validateString(String str) throws PersonCreationException {
        if (myStringIsNullOrEmpty(str)) {
            throw new PersonCreationException("Invalid name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws PersonCreationException {
        validateString(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be in the range [0 ... 120[");
        }
        this.age = age;
    }
}
