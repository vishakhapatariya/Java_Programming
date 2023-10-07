// 2) Remove space from string using string buillder and buffer

package Strings;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        // Removing space using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if((arr[i] != ' ') && (arr[i] != '\t')){
                stringBuilder.append(arr[i]);

            }
        }

        // Removing space using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<arr.length; i++){
            if((arr[i] != ' ') && (arr[i] != '\t')){
                stringBuffer.append(arr[i]);

            }
        }

        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
