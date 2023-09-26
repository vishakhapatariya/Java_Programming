// Object class
// Override toString, hashCode and equals method in a class

class MyClass {
    @Override
    public String toString() {
        return "MyObject";
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    // wait, notify, notifyAll, getClass are final methods therefore we can not override these methods
}

public class LangDemo2 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        System.out.println(obj1.equals(obj2));
    }
}
