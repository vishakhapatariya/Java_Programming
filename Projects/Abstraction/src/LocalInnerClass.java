// Local Inner class exercise

class OuterClass{
    public void display(){
        // Inner class
        class InnerClass{
            public void show(){
                System.out.println("Hello");
            }
        }
//        InnerClass i = new InnerClass();
//        i.show();

        // Object is not having any reference and there is no name given to the object, So this object is Anonymous object
        new InnerClass().show();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        o.display();
    }
}
