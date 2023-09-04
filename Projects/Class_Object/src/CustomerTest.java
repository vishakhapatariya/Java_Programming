// Constructor Challenge Exercise
class Customer{
    private String custId;
    private String name;
    private String address;
    private String PhoneNo;

    public Customer(String cid, String n) {
        custId = cid;
        name = n;
    }

    public Customer(String cid, String n, String a, String pn) {
        custId = cid;
        name = n;
        setAddress(a);
        setPhoneNo(pn);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setPhoneNo(String pn) {
        PhoneNo = pn;
    }
}

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("A101", "Vishakha");
        System.out.println("c1 custuid : "+c1.getCustId());
        System.out.println("c1 name : "+c1.getName());
        System.out.println("c1 address : "+c1.getAddress());
        System.out.println("c1 phone no : "+c1.getPhoneNo());

        Customer c2 = new Customer("A102", "Patariya","ABC","1234567890");
        System.out.println("\nc2 custuid : "+c2.getCustId());
        System.out.println("c2 name : "+c2.getName());
        System.out.println("c2 address : "+c2.getAddress());
        System.out.println("c2 phone no : "+c2.getPhoneNo());
    }
}
