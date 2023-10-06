// Bound in Generic methods

public class BoundsMethods {
    static <E extends Number> void show(E... list)  // E... -> Varargs works for any no. of arguments
    {
        for (E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(1,2,3,4);
        show(10,20);
    }
}
