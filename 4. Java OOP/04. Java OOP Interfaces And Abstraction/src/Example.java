public class Example {
    private String name;
    private int age;

    Example(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + this.name + '\'' +
                "age='" + this.age + '\'' +
                '}';
    }
}
