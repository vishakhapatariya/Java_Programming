// Thread methods

class MyNewThread2 extends Thread{
    public MyNewThread2(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThread2 t = new MyNewThread2("My Thread 1");

        System.out.println("ID : "+t.getId());
        System.out.println("Name : "+t.getName());
        System.out.println("Priority : "+t.getPriority());
        t.start();
        System.out.println("State : "+t.getState());
        System.out.println("Alive : "+t.isAlive());
    }
}
