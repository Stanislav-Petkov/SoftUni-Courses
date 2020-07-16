package Animals;

public abstract class Animal implements ProduceSound {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setGender(String gender) {
        validateParam(gender);
        this.gender = gender;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Invalid input!");
        }
        this.age = age;
    }

    private void setName(String name) {
        validateParam(name);
        this.name = name;
    }

    private void validateParam(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalStateException("Invalid input!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return String.format("%s%n%s %d %s%n%s", this.getClass().getSimpleName(),
                this.name, this.age, this.gender, this.produceSound());
    }


}
/*
expected: 'Tomcat\r\nTomcat 12 Male\r\nMEOW')!
expected:<Tomcat[ \r\nTomcat 12 Male ]\r\nMEOW>
 but was:<Tomcat[\r\nTomcat 12 Male]\r\...
 */