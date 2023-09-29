// Deprecated Annotation

package builtInAnnotations;

class OldClass {
    public void display() {
        System.out.println("Hello");
    }

    @Deprecated
    public void show() {
        System.out.println("Hii");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args) {
        OldClass oc = new OldClass();
        oc.show();
    }
}
