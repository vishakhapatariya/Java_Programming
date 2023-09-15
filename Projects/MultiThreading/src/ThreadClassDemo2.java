// Thread class exercise
// Overriding run method within the same class

public class ThreadClassDemo2 extends Thread {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadClassDemo2 t2 = new ThreadClassDemo2();
        t2.start();

        int j = 1;
        while (j < 100) {
            System.out.println(j + " World");
            j++;
        }
    }
}
