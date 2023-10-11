// 1) use this keyword in example and also make comments for each use of 'this' keyword

package Static_This;

public class ThisDemo {

    String name;
    int age;

    // Assigning values in Constructor
    ThisDemo(String name, int age) {
        // Assigning input argument name to current name
        this.name = name;
        // Assigning input argument age to current age
        this.age = age;
    }

    // Method to Print the Details of person
    public String toString() {
        // Returning String
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ThisDemo first = new ThisDemo("Vishakha", 20);
        ThisDemo second = new ThisDemo("Amika", 21);

        // Calling toString() method
        System.out.println(first);
        System.out.println(second);
    }
}
