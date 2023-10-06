// WhildCard in Generics

class X{}
class Y extends X{}
class Z extends Y{}

@SuppressWarnings("unchecked")
class MyClass2<T> {
    T data[] = (T[]) new Object[10];
    int length = 0;

    public void append(T value) {
        data[length++] = value;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }
}

public class WhildCard2 {
    static void fun(MyClass2<? extends X> obj){
        obj.display();
    }

    // This will allow only object of X class and
    // super class of X class in argument
    static void fun2(MyClass2<? super X> obj){
        obj.display();
    }

    // This will allow only object of Y class and
    // super class of Y class in argument
    static void fun3(MyClass2<? super Y> obj){
        obj.display();
    }

    // This will allow only object of Y class and
    // super class of Y class in argument
    static void fun4(MyClass2<? super Z> obj){
        obj.display();
    }

    public static void main(String[] args) {
        MyClass2<X> m1 = new MyClass2<>();
        MyClass2<Y> m2 = new MyClass2<>();
        MyClass2<Z> m3 = new MyClass2<>();

        // Allow object of class X and subclasses of X
        fun(m1);
        fun(m2);
        fun(m3);

        // Allow object of class X and superclasses of X
        fun2(m1);

        // Allow object of class Y and superclasses of Y
        fun3(m2);
        fun3(m1);

        // Allow object of class Z and superclasses of Z
        fun4(m1);
        fun4(m2);
        fun4(m3);
    }
}
