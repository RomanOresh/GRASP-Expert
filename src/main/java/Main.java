public class Main {

    public static void main(String[] args) {

        User user = new User();
        Address address = new Address("Houston", "New York", "New York");

        user.setAddress(address);
        System.out.println(user.getAddress());

        Address address1 = new Address("Eight Mile West", "Detroit", "Michigan");
        user.setAddress(address1);
        System.out.println(user.getAddress());
    }
}
