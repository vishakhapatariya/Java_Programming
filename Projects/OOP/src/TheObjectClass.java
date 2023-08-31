// java.lang.object Exercise

public class TheObjectClass extends Object {
    public static void main(String[] args) {
        Students max = new Students("max",21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy",8,"Carol");
        System.out.println(jimmy);
    }
}

class Students {
    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is "+ age;
//        return "Students{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Students{
    private String parentName;
    PrimarySchoolStudent(String name,int age,String parentName){
        super(name,age);
        this.parentName=parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " +super.toString();
    }
}
