// Area of a Triangle

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args)
    {
        // Method 1

//        float base,height,area;
//        System.out.println("Enter Base and Height");
//        Scanner sc=new Scanner(System.in);
//        base=sc.nextFloat();
//        height=sc.nextFloat();
//        area=base*height*0.5f;
//        //area=1f/2f*base*height;
//        //area=base*height/2;
//        System.out.println("Area of Triangle is "+area);


        // Method 2
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        double s,area;

        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of Triangle is "+area);
    }
}
