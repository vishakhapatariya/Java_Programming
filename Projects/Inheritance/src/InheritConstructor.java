// Inheritance in constructor

class Parent {
    public Parent() {
        System.out.println("Parent Constrcutor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class InheritConstructor {
    public static void main(String[] args) {
        GrandChild c = new GrandChild();
    }
}
