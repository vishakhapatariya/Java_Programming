/* 1) Write a java program which demonstrate Inheritance concept.
Create a class named 'Member' having the following members:
Data members: Name, Age, Phone number, Address, Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager'
classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a manager
by making an object of both of these classes and print the same.
 */

package Interface;

// Member Class
class Member {
    // Data members of Member class
    String name;
    int age;
    String phoneNo;
    String address;
    int salary;

    public void printSalary() {

    }
}

class Employee extends Member {
    String specialization;

    // Constructor of Employee which assign values to fields
    public Employee(String name, int age, String phoneNo, String address, int salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    // toString() method returns a string
    @Override
    public String toString() {
        return "Name : " + name +
                "\nAge : " + age +
                "\nPhone No. : " + phoneNo +
                "\nAddress : " + address +
                "\nSpecialization : " + specialization;
    }

    // printSalary() method, prints the salary of an Employee
    @Override
    public void printSalary() {
        System.out.println("Salary of an Employee : " + salary);
    }
}

class Manager extends Member {
    String department;

    // Constructor of Manager which assign values to fields
    public Manager(String name, int age, String phoneNo, String address, int salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    // toString() method returns a strin
    @Override
    public String toString() {
        return "Name : " + name +
                "\nAge : " + age +
                "\nPhone No. : " + phoneNo +
                "\nAddress : " + address +
                "\ndepartment : " + department;
    }

    // printSalary() method, prints the salary of a Manager
    @Override
    public void printSalary() {
        System.out.println("Salary of a Manager : " + salary);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {

        // Object of Employee Class
        Employee employee = new Employee("Vishakha", 20, "1234567890", "Rajkot", 20000, "Networking");
        // Object of Manager Class
        Manager manager = new Manager("Amika", 21, "9087654321", "Surat", 50000, "Computer Engineering");

        // Printing Employee Details
        System.out.println("Employee Details");
        System.out.println(employee);
        employee.printSalary();
        System.out.print("----------------------------");

        // Printing Manager Details
        System.out.println("\nManager Details");
        System.out.println(manager);
        manager.printSalary();
    }
}
