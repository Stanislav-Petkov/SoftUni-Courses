package Person;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    public void sadAboutQuarantine() {
        System.out.println(":(");
    }

    public void sadAboutQuarantine(String name, int number) {
        System.out.println(name + " Will be sad for " + number + "of days");
    }

    public String sadAboutQuarantine(int number, String name) {
        return String.format(name + " Will be sad for " + number + "of days");
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }

}
