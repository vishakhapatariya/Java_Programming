// Throw and throws exercise

// Counting area of a rectangle. If passing negative value then throw an exception
class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a rectangle can not be negative";
    }
}

public class ThrowThrowsDemo {
    static int area(int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException {
        System.out.println("Area is : "+area(-10,2));
    }
    public static void main(String[] args) {
        try {
            meth1();
        }catch (NegativeDimensionException e){
            System.out.println(e);
        }
    }
}
