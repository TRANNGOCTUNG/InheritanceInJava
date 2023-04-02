package has_a;

public class Address {
    String city;
    String country;
    String zipcode;

    public Address() {
        city = "Hà Nội";
        country = "Việt Nam";
        zipcode = "D4431";
    }

    public Address(String city, String country, String zipcode) {
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }
}
