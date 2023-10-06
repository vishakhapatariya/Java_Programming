// Creating an Array Object of same type using Generics

@SuppressWarnings("unchecked")
public class GenericDemo2<T> {
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

    public static void main(String[] args) {
        GenericDemo2<String> gd = new GenericDemo2<>();
        gd.append("Hii");
        gd.append("Hello");
        gd.append("Good Morning!");

        gd.display();
    }
}
