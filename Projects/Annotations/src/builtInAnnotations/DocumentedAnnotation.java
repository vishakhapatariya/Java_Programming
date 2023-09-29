// Documented Annotation

package builtInAnnotations;

import java.lang.annotation.Documented;

@Documented
// If an annotation type is marked with a Documented annotation,
// the Javadoc tool will generate documentation for all of its instances

@interface MyAnno2 {
    // Meta data
    String name();

    String project();

    String date() default "Today";

    String version() default "13";
}

@MyAnno2(name = "Vishakha", project = "Bank")
public class DocumentedAnnotation {
    int data;

    public static void main(String[] args) {
        int x;
    }
}
