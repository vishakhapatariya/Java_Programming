// Dynamic method dispatch in Method overriding

class Animal{
    int x=10;
    public void eat(){
        System.out.println("Animal is eating!");
    }
}

class Bird extends Animal{
    int x=20;
    public void eat(){
        System.out.println("Bird is eating!");
    }
}

public class Overriding {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eat();
        System.out.println(a.x);
        Bird b = new Bird();
        b.eat();
        System.out.println(b.x);
        Animal c = new Bird();
        c.eat();
        System.out.println(c.x);
    }
}
