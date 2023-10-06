// Generics Demo

public class GenericDemo<T> {
    private T obj;

    public void setData(T data) {
        obj = data;
    }

    public T getData() {
        return obj;
    }

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.setData("Hello");
        System.out.print(gd.getData());
    }
}
