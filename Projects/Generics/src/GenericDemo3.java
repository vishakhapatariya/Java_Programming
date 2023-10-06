// Creating an Array Object of same type using Generics
class MyArray<T> {
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

public class GenericDemo3 {
    public static void main(String[] args) {
        MyArray<String> gd = new MyArray<>();
        gd.append("Hii");
        gd.append("Hello");
        gd.append("Good Morning!");

        gd.display();
    }
}
