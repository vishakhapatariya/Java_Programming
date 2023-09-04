// Student details, total and average marks & Grade
class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString() {
        return "Roll No: " + roll + "\nName: " + name + "\nCourse: " + course;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 1;
        s.name = "Vishakha";
        s.course = "Java";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 90;
        System.out.println("Details\n" + s);
        System.out.println("Total : " + s.total());
        System.out.println("Average : " + s.average());
        System.out.println("Grade : " + s.grade());
    }
}
