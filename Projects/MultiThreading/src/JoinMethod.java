// Join method example in thread

class MyNewThread5 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) {
        MyNewThread5 t = new MyNewThread5();
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
