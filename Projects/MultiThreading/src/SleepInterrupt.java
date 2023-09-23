//Sleep & Interrupt methods in thread

class MyNewThread3 extends Thread {
    public MyNewThread3(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class SleepInterrupt {
    public static void main(String[] args) {
        MyNewThread3 t = new MyNewThread3("Thread 1");
        t.start();
        t.interrupt();
    }
}
