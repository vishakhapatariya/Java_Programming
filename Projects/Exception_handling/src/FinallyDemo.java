// Finally block exercise

public class FinallyDemo {
    static void meth1()throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            // this message will execute weather there is an exception or not
            System.out.println("Final Message");
        }
    }

    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
