// Thread constructor demo

class MyNewThread extends Thread{
    public MyNewThread(String name){
        // passing name to the super class constructor
        super(name);
    }
}

public class ThreadConstructors {
    public static void main(String[] args) {
        // passing name to the constructor
        MyNewThread t = new MyNewThread("My thread 1");
        System.out.println(t.getName());
    }
}
