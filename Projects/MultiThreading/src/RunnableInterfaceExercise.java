// Runnable Interface
// creating Runnable interface in nested class and getting name of current thread

public class RunnableInterfaceExercise{
    public static void main(String[] args) {
        System.out.println("Current thread : "+Thread.currentThread().getName());
        RunnableInterfaceExercise.MyRunnable ri = new RunnableInterfaceExercise().new MyRunnable();
        Thread r1 = new Thread(ri);
        r1.start();
    }

    class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Current thread : " + Thread.currentThread().getName());
        }
    }
}
