// Multiple parameters in Generics

@SuppressWarnings("unchecked")
public class MultipleParameters<T,V> {
    T id;
    V name;
    int length = 0;

    public void append(T id, V name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        MultipleParameters<Integer,String> gd = new MultipleParameters<>();

        gd.append(1,"Vishakha");
        gd.display();
        gd.append(2,"Patariya");
        gd.display();
    }

}
