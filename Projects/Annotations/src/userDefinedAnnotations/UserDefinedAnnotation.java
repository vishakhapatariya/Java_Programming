// User-defined Annotation

package userDefinedAnnotations;

@interface MyAnno {
    // Meta data
    String name();

    String project();

    String date() default "Today";

    String version() default "13";
}

@MyAnno(name = "Vishakha", project = "Bank")
public class UserDefinedAnnotation {
    int data;

    public static void main(String[] args) {
        int x;
    }
}
