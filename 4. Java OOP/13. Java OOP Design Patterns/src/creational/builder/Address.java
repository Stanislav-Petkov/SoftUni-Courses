package creational.builder;

public class Address {
    private final String country;
    private final String city;

    private Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public static Address.SofiaBulgariaDefaultBuilder builder() {
        return new SofiaBulgariaDefaultBuilder();
    }

    public static class SofiaBulgariaDefaultBuilder extends Builder {
        private String country = "BG";
        private String city = "SF";

        public Builder withCountry(String country) {
            this.country = country;
            return super.withCountry(country);
        }

        public Builder withCity(String city) {
            this.city = city;
            return super.withCity(city);
        }

        @Override
        public Address build() {

            super.withCity(city);
            super.withCountry(country);
            return super.build();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static class Builder {
        private String country;
        private String city;


        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(
                    this.country,
                    this.city
            );
        }
    }
}

