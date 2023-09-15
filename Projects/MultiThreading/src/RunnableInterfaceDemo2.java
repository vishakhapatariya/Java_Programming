// Thread class exercise
// Overriding run method within the same class

public class RunnableInterfaceDemo2 implements Runnable{
    public void run(){
        int i=1;
        while (i<100){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        RunnableInterfaceDemo2 r2 =  new RunnableInterfaceDemo2();
        Thread th2 = new Thread(r2);
        th2.start();

        int j=1;
        while (j<100){
            System.out.println(j+" World");
            j++;
        }
    }
}
