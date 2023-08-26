// Called Account class methods

public class AccountMain {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setAccountNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.setPhoneNumber("(+91) 123-456-7890");

        bobsAccount.depositeFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositeFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

    }
}
