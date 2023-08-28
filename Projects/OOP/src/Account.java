// Created bank deposit and withdraw methods.

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called!");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account customer with parameter called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        phoneNumber = phone;
    }

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this("9999", 100.55, customerName, customerEmail, phoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void depositeFunds(double depositeAmount) {
        balance += depositeAmount;
        System.out.println("Deposite of $" + depositeAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Reamining balance = $" + balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String customerEmail;
    private String phoneNumber;
}
