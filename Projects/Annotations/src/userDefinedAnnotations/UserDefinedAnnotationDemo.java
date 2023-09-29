// User-defined Annotation

package userDefinedAnnotations;

@interface MyAnnotation {

}

// If metadata is not there in the Annotation
// then we can use that annotation at class level, method level, instance, local variable and argument level

@MyAnnotation
public class UserDefinedAnnotationDemo {
    @MyAnnotation
    int data;

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {

        @MyAnnotation
        int x;
    }
}
