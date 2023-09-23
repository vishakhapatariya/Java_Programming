// Daemon Thread

class MyNewThread4 extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        MyNewThread4 t = new MyNewThread4();
        t.setDaemon(true);
        t.start();
        try {
            t.sleep(10);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
