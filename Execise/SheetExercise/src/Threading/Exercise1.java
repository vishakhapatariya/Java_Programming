/* 1) Create two threads,OddThread and EvenThread. OddThread should be
child of Thread class and EvenThread should implement Runnable interface.
OddThread should print all odd number between 1 to 1000 and EvenThread
should print number between 1 to 1000 */

package Threading;

// OddThread class extends Thread class
class OddThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            // Printing Odd number
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
            i++;
        }
    }
}

// EvenThread class implements Runnable Interface
class EvenThread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            // Printing Even numbers
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // Creating objects of OddThread and EvenThread class
        OddThread oddThread = new OddThread();
        EvenThread et = new EvenThread();
        Thread evenThread = new Thread(et);

        // Starting both Threads
        oddThread.start();
        evenThread.start();
    }
}
