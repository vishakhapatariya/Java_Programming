// Thread class
// Variable concurrency problem

public class ThreadClassExercise extends Thread {
    public static int amount = 0;

    public void run() {
        amount++;
    }

    public static void main(String[] args) {

        ThreadClassExercise obj = new ThreadClassExercise();
        obj.start();

        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
