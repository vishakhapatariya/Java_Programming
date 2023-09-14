// Resources Exercise

import java.io.*;
import java.util.*;

public class ResourcesDemo
{
    static void Divide() throws Exception
    {
        // File and scanner will be close automatically
        try(FileInputStream fi=new FileInputStream("/home/pp-8/Desktop/vishakha/Java/Java_Programming/Projects/Exception_handling/src/Test.txt");Scanner sc=new Scanner(fi) )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }
    }

    public static void main(String[] args) throws Exception
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}