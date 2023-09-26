// Object class

import java.lang.*;

public class LangDemo {
    public static void main(String args[]){
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        // toString method
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3.toString());

        // equals method
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));

        // hashcode method
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
