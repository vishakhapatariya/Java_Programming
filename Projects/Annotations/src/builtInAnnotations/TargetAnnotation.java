// Target Annotation

package builtInAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.LOCAL_VARIABLE)
// The Target annotation annotates where to use an annotation
// It also allows array of values

@interface MyAnno3 {
    // Meta data
    String name();

    String project();

    String date() default "Today";

    String version() default "13";
}


public class TargetAnnotation {
    int data;


    public static void main(String[] args) {
        @MyAnno3(name = "Vishakha",project = "Bank")
        int x;
    }
}
