// Bounds On Generics

class A {
}

class B extends A {
}

class C extends A {
}

@SuppressWarnings("unchecked")
class MyArrayClass<T extends A> {
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

public class BoundsOnGenerics {
    public static void main(String[] args) {
        MyArrayClass<A> mas = new MyArrayClass<>();
    }
}
