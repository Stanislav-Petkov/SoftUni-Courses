package EqualityLogic;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode() + Integer.hashCode(age)) * 73;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other.getClass().getSimpleName().equals(Person.class.getSimpleName())) {
            Person second = (Person) other;
            return this.name.equals(second.name) && this.age == second.age;
        }
        return false;
    }

    @Override
    public int compareTo(Person other) {
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = this.age - other.age;
        }
        return result;
    }
}
