/* 2) In the above exercise, you have noticed that the sequence
 of output is not in our control. Everytime you run, It gives
 different output. Now change the logic of these threads class
 in a such a way that number should display in proper sequence.
 For Exa 1 2 3 …. 999 1000 */

package Threading;

class MyThread {
    public Boolean flag = true;

    synchronized public void printEven(int val) {
        // Wait till flag is false
        if (flag != true) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // If flag is true, execute below statements
        System.out.println(val);
        flag = false;
        notify();
    }

    synchronized public void printOdd(int val) {
        // Wait till flag is true
        if (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // If flag is false, execute below statements
        System.out.println(val);
        flag = true;
        notify();
    }
}

class MyOddThread extends Thread {
    MyThread myThread;

    // Assigning object of my thread
    public MyOddThread(MyThread mt) {
        myThread = mt;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            // Print if number is odd
            if (!(i % 2 == 0)) {
                myThread.printOdd(i);
            }
            i++;
        }
    }
}

class MyEvenThread implements Runnable {
    MyThread myThread;

    // Assigning object of my thread
    public MyEvenThread(MyThread mt) {
        myThread = mt;
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 1000) {
            // Print if number is even
            if (i % 2 == 0) {
                myThread.printEven(i);
            }
            i++;
        }
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        // Creating object of MyThread class
        MyThread myThread = new MyThread();

        // Creating Objects of MyOddThread and MyEvenThread class
        MyOddThread oddThread = new MyOddThread(myThread);
        MyEvenThread et = new MyEvenThread(myThread);
        Thread evenThread = new Thread(et);

        // Starting both threads
        evenThread.start();
        oddThread.start();

    }
}
