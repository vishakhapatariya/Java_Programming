// Runnable Interface
// throwing an exception in run method

import java.io.FileNotFoundException;

public class RunnableInterfaceExercise2 {
    public static void main(String[] args) {
        System.out.println("Current thread : "+Thread.currentThread().getName());
        Thread r2 = new Thread(new RunnableInterfaceExercise2().new MyRunnable2());
        r2.start();
    }

    class MyRunnable2 implements Runnable{
        public void run(){
            System.out.println("Current thread : "+Thread.currentThread().getName());
            try{
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.out.println("File is not found!");
                e.printStackTrace();
            }
            int a = 1/0;
        }
    }
}
