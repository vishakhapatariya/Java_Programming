// Inheritance Exercise
// Account -> parent class
// SavingsAccount , LoanAccount -> Child class

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    ;

    public String getPhno() {
        return phno;
    }

    public String getDOB() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class AccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("A101", "Vishakha", "ABC", "1234567890", "1/2/23");
        System.out.println("Current Balance : " + sa.balance);
        sa.deposit(20000);
        System.out.println("Balance after deposit : " + sa.balance);
        sa.withdraw(5000);
        System.out.println("Balance after withdraw : " + sa.balance);

        LoanAccount la = new LoanAccount("LA101", "Patariya", "XYZ", "9876543210", "9/9/23");
        la.setBalance(30000);
        System.out.println("Current Balance : " + la.balance);
        la.payEMI(25000);
        System.out.println("Balance payEMI : " + la.balance);
        la.repay(30000);
        System.out.println("Balance repay : " + la.balance);
    }
}
