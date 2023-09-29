// SuppressWarning Annotation

package builtInAnnotations;

import java.util.List;

class OldClass2{
    List l;

    @SuppressWarnings("unchecked")
    public void display(){
        l.add(10);
        System.out.println("Hello");
    }

    @Deprecated
    public void show(){
        System.out.println("Hii");
    }
}

public class SuppressWarningAnnotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OldClass2 oc = new OldClass2();
        oc.show();
        oc.display();
    }
}
