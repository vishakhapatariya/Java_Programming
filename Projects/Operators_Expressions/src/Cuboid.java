// Area and Volume of Cuboid

import java.util.Scanner;
import java.lang.*;
public class Cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float length, breadth, height;
        float totalArea, volume;

        System.out.println("Enter length : ");
        length = sc.nextFloat();
        System.out.println("Enter breadth : ");
        breadth = sc.nextFloat();
        System.out.println("Enter height : ");
        height = sc.nextFloat();

        totalArea = 2 * (length * breadth + length * height + breadth * height);

        volume = length * breadth * height;

        System.out.println("Total Area " + totalArea);
        System.out.println("Volume " + volume);
    }
}
