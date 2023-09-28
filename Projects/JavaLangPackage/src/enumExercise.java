// enum constructor and method exercise

enum Dept1{
    CS,CE,CIVIL,IT;
    private Dept1(){
        System.out.println(this.name());
    }

    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }
}

public class enumExercise {
    public static void main(String[] args) {
        Dept1 d = Dept1.CIVIL;
        d.display();
        switch (d){
            case CS:
                System.out.println("Head : 1 \nBlock : A");
                break;
            case CE:
                System.out.println("Head : 2 \nBlock : B");
                break;
            case CIVIL:
                System.out.println("Head : 3 \nBlock : C");
                break;
            case IT:
                System.out.println("Head : 4 \nBlock : D");
                break;
        }
    }
}
