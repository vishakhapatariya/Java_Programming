// Created constructors without argument and with arguments and called them inside by using this()

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Vishakha", "v@gmail.com");
        System.out.println("Constructor without arguments");
    }

    public Customer(String name, String email) {
        this(name, 2000.0, email);
    }

    public Customer(String name, double creditLimit, String email) {
        System.out.println("This is parameterised constructor");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
