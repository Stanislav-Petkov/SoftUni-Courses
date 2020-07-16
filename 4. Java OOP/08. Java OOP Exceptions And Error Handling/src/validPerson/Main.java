package validPerson;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("", "4p", 41);
        } catch (PersonCreationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
