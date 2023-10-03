// 3) Write a program to find second-largest elements and third-smallest element
// from the array. Array should be of length 50

package arrays;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int arr[] = { 12,13,14,15,
            1,2,3,4,5,49,50,6,7,9,10,
            11,21,22,23,24,25,17,18,19,20,
            26,27,28,30,33,34,35,37,
            31,32,38,39,40,12,-13,14,15,16,
            41,46,47,42,44,45,48 };

        System.out.println("Using Method 1");
        method1(arr);
        System.out.println("\nUsing Method 2");
        method2(arr);
    }

    public static void method1(int arr[]){
        int max = arr[0];
        int secMax = arr[0];

        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int thirdSmall = Integer.MAX_VALUE;

        for(int i=0;i<50;i++){

            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }

            if(arr[i]<smallest){
                thirdSmall = secSmall;
                secSmall = smallest;
                smallest = arr[i];
            } else if (arr[i]<secSmall) {
                thirdSmall = secSmall;
                secSmall = arr[i];
            } else if (arr[i]<thirdSmall) {
                thirdSmall = arr[i];
            }
        }

        // System.out.println("max : "+max);
        System.out.println("second max : "+secMax);
        // System.out.println("small : "+smallest);
        // System.out.println("second small : "+secSmall);
        System.out.println("Third small : "+thirdSmall);
    }

    public static void method2(int arr[]){
        Arrays.sort(arr);
        // System.out.println("max : "+arr[arr.length - 1]);
        System.out.println("second max : "+arr[arr.length - 2]);
        // System.out.println("small : "+arr[0]);
        // System.out.println("second small : "+arr[1]);
        System.out.println("Third small : "+arr[2]);
    }
}
