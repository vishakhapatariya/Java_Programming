// Inherited Annotation

package builtInAnnotations;

import java.lang.annotation.Inherited;

@Inherited
// It works on current class as well as on it's child class

@interface MyAnno4 {
    // Meta data
    String name();

    String project();

    String date() default "Today";

    String version() default "13";
}
public class InheritedAnnotation {
    int data;


    public static void main(String[] args) {
        @MyAnno3(name = "Vishakha",project = "Bank")
        int x;
    }
}
