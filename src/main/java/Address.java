public class Address {

    public String street;
    public String city;
    public String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address " +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'';
    }
}
