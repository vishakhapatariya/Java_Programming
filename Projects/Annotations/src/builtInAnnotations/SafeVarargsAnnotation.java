// SafeVarargs Annotation

package builtInAnnotations;

class My<T> {
    @SafeVarargs
    private void show(T... arg) {
        for (T x : arg)
            System.out.println(x);
    }
}

public class SafeVarargsAnnotation {
    public static void main(String[] args) {

    }
}
