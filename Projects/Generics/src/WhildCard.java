// WhildCard in Generics

@SuppressWarnings("unchecked")
class MyClass<T> {
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
public class WhildCard {
    static void fun(MyClass<? extends Number> obj){
        obj.display();
    }

    // This will allow only object of Number class and
    // super class of Number class in argument
    static void fun2(MyClass<? super Number> obj){
        obj.display();
    }

    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass();
        mc1.append("Hii");
        mc1.append("Good Morning!");

        MyClass<Integer> mc2 = new MyClass();
        mc2.append(10);
        mc2.append(20);

        // fun(mc1);  --> Wild Card argument will not allow String type of Object
        fun(mc2);

        // fun2 allows only super class objects of Number and
        // String & Integers are not super class of Number
        //fun2(mc1);
        //fun2(mc2);
    }
}
