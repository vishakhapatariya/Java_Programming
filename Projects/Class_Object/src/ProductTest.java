// Constructor Challenge Exercise
class Product {
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public Product(String itNo, String pname) {
        itemNo = itNo;
        name = pname;
    }

    public Product(String itNo, String n, double p, int q) {
        itemNo = itNo;
        name = n;
        setPrice(p);
        setQuantity(q);
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setQuantity(int q) {
        quantity = q;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("A-1", "Book");
        System.out.println("p1 item No : "+p1.getItemNo());
        System.out.println("p1 name : "+p1.getName());
        System.out.println("p1 address : "+p1.getPrice());
        System.out.println("p1 phone no : "+p1.getQuantity());

        Product p2 = new Product("A-2", "Pen", 200, 10);
        System.out.println("\np2 item No : "+p2.getItemNo());
        System.out.println("p2 name : "+p2.getName());
        System.out.println("p2 address : "+p2.getPrice());
        System.out.println("p2 phone no : "+p2.getQuantity());
    }
}
