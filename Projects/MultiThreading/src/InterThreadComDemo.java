// Inter-Thread Communication
// Producer class method is writing value and Consumer class method is reading that value by communicating and notifying each other using Inter-Thread Communication

class MyData2
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer extends Thread
{
    MyData2 data;

    public Producer(MyData2 d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData2 data;

    public Consumer(MyData2 d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterThreadComDemo
{
    public static void main(String[] args)
    {
        MyData2 data=new MyData2();

        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();

    }
}
