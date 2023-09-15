//Runnable interface exercise
// Overriding run method in different class

class MyRunnable implements Runnable{
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread th1 = new Thread(r1);
        th1.start();

        int j = 1;
        while (j < 100) {
            System.out.println(j + " World");
            j++;
        }
    }
}
