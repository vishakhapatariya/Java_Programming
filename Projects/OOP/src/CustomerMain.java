// Created customer class objects and called constructors with different arguments

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());

        Customer customer2 = new Customer("Amika", 5000, "a@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        Customer customer3 = new Customer("Dhruvi", "a@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
    }
}
