// Employee(Super) class of HourlyEmployee & SalariedEmployee with some fields and methods
// Child class of Worker Class
public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", hireDate='" + hireDate + '\'' + "} " + super.toString();
    }
}
