// Sub Class in Generics

class MyArrayParent<T> {
    T data[] = (T[]) new Object[10];
    int index = 0;

    public void setData(T data) {
        this.data[index++] = data;
    }

    public void show() {
        for (int i = 0; i < index; i++) {
            System.out.println(data[i]);
        }
    }
}

class MyArraySub<T> extends MyArrayParent<T> {

}

public class SubClass {
    public static void main(String[] args) {
        MyArraySub<Integer> mas = new MyArraySub<>();
        mas.setData(10);
        mas.setData(20);
        mas.setData(30);
        mas.show();
    }
}
