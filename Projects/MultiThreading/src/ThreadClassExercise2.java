// Thread class
// isAlive() method in threads

public class ThreadClassExercise2 extends Thread {
    public static int amount = 0;

    public void run() {
        amount++;
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        ThreadClassExercise2 obj2 = new ThreadClassExercise2();
        obj2.start();

        while (obj2.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
