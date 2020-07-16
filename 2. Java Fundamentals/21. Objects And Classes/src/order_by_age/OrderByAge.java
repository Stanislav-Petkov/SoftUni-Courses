package order_by_age;

public class OrderByAge {
    private String name;
    private String id;
    private int age;

    OrderByAge(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
