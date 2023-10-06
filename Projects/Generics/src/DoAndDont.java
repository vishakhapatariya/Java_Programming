// Do's and Don't in Generics

class P<T> {
    public void show(T a) {
        System.out.print("Hii");
    }
}

interface Q {
}

interface R {
}

class S extends P {
}

// 1. Only extends keyword is allowed in Generic class definition
// 2. Interfaces are also extends in Generics
class Class1<T> {
}

// 3. Can extend only one class and multiple interface, First one must be a class
class Class2<T extends P & Q & R> {
}

class Class3<T> {
}

public class DoAndDont {

    // 4. extends and super both are allowed with ?(WildCard) in Generics
    static void meth1(Class3<? extends P> arg) {
    }

    static void meth2(Class3<? super S> arg) {
    }

    static void meth3(P<?> arg) {
        // 5. <?> will accept all types but can not access it
        //arg.show("Hiii");    --> It will not allow this <?> will accept String type but can not access it
    }

    public static void main(String[] args) {
        // 6. Base type of Object should be the same or ?
        Class3<Integer> obj = new Class3<Integer>();
        Class3<?> obj2 = new Class3<Integer>();
        P<?> obj3 = new P<Integer>();
        //obj3.show("Hii");   --> This will not allow because type of reference is <?>


        P<String> op = new P<>();
        meth3(op);
    }
}
