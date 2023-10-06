// Generic Methods

public class GenericMethods {
    static <E> void show(E... list)  // E... -> Varargs works for any no. of arguments
    {
        for (E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show("Hi","Hello");
        show(1,2,3,4,5);
    }
}
