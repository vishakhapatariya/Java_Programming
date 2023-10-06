// Bounds on Generics
// Not declaring type at the time of creation of object
class MyArray2<T> {
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

@SuppressWarnings("unchecked")
public class ArrayObjectDemo3<T> {
    public static void main(String[] args) {
        MyArray2 gd = new MyArray2();

        gd.append("Hii");
        gd.append(10);
        gd.append("Good Morning!");

        gd.display();
    }
}
