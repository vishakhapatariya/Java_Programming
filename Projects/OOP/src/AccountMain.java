// Called Account class methods

public class AccountMain {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
//        Account bobsAccount = new Account("123", 1000.0, "Vishakha", "v@gmail.com", "1234567890");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.withdrawFunds(100.0);
//        bobsAccount.setPhoneNumber("(+91) 123-456-7890");

        bobsAccount.depositeFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositeFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);

        Account newAccount = new Account("Vi", "vi@gmail.com", "9876");
        System.out.println("Account no. : " + newAccount.getAccountNumber()
                + "; Name : " + newAccount.getCustomerName());
    }
}
