// yield method exercise in thread

class MyNewThread6 extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ + " My Thread");
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        MyNewThread6 t = new MyNewThread6();
        t.setDaemon(true);
        t.start();
        int count = 1;
        while (true) {
            System.out.println(count++ + " Main");
            Thread.yield();
        }
    }
}
