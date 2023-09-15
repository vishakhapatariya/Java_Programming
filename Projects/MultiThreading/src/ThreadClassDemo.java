// Thread class exercise
// Overriding run method in different class

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        int j = 1;
        while (j < 100) {
            System.out.println(j + " World");
            j++;
        }
    }
}
