// enum

enum DeptDemo {
    CS,CIVIL,IT,CE
}
public class enumDemo {
    public static void main(String[] args) {
        DeptDemo a = DeptDemo.CE;
        DeptDemo b = DeptDemo.CIVIL;
        System.out.println(a.ordinal());
        System.out.println(b.name());

        DeptDemo list[] = DeptDemo.values();
        for(DeptDemo x:list)
            System.out.println(x);
    }
}
