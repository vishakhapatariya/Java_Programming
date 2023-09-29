// Retention Annotation

package builtInAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
// --> Refers to the .class file, available to java compiler but not to JVM. It is included in the class file

//@Retention(RetentionPolicy.RUNTIME)
//--> Refers to the runtime, available to java compiler and JVM

//@Retention(RetentionPolicy.SOURCE)
//--> Refers to the source code, discarded during compilation. It will not be available in the compiled class

@interface MyAnno {
    // Meta data
    String name();

    String project();

    String date() default "Today";

    String version() default "13";
}

@MyAnno(name = "Vishakha", project = "Bank")
public class RetentionAnnotation {
    int data;

    public static void main(String[] args) {
        int x;
    }
}
