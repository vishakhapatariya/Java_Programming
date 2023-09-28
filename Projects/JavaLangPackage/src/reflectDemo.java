// Reflect Package Introduction

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {
    }

    public My(int x, int y) {
    }

    public void display(String s1, String s2) {
    }

    public int show(int x, int y) {
        return 0;
    }

}

public class reflectDemo {
    public static void main(String[] args) {
        // method 1
        Class c = My.class;

//        // method 2
//        My m = new My();
//        Class c1 = m.getClass();

        // get class name
        System.out.println(c.getName());

        // get fields name
        Field field[] = c.getDeclaredFields();
        for (Field x : field) {
            System.out.println(x);
        }

        // get constructors name
        Constructor con[] = c.getConstructors();
        for (Constructor x : con) {
            System.out.println(x);
        }

        // get methods name
        Method m[] = c.getMethods();
        for (Method x : m) {
            System.out.println(x);
        }

        // get parameters name of a method
        Parameter param[] = m[0].getParameters();
        for (Parameter x : param) {
            System.out.println(x);
        }
    }
}
