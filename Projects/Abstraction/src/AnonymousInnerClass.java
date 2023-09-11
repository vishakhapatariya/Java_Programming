// Anonymous Inner Class exercise

abstract class My{
    abstract public void show();
}

// We can make anonymous class of interface also
//interface My{
//    public void show();
//}

class OuterClass2{
    public void display(){
//        My m = new My() {
//            @Override
//            public void show() {
//                System.out.println("Hello");
//            }
//        };
//        m.show();

        // This is anonymous object as well as anonymous class
        new My(){
            @Override
            public void show() {
                System.out.println("Hello");
            }
        }.show();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        OuterClass2 o = new OuterClass2();
        o.display();
    }
}
