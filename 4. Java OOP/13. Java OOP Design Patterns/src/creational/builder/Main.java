package creational.builder;

public class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
                .withCountry("Bulgaria")
                .build();
        System.out.println(address);
    }
}

