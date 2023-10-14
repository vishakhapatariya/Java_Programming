/* 4) Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
  o largeSubString(&quot;catcowcat&quot;, &quot;cat&quot;) → 9
  o largeSubString(&quot;catcowcat&quot;, &quot;cow&quot;) → 3
  o largeSubString(&quot;cccatcowcatxx&quot;, &quot;cat&quot;) → 9
 */

package Strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter Sub String : ");
        String subStr = sc.nextLine();

        char[] arr = str.toCharArray();
        char[] subArr = subStr.toCharArray();
        int length=0;
        int startIndex=0,endIndex=0;

        Task : for(int i=0;i<arr.length;i++){
            if(arr[i]==subArr[0]) {
                startIndex=i;
                length = 1;
                for (int j = 1; j < subArr.length; j++) {
                    if (arr[i + 1] != subArr[j]) {
                        length = 0;
                        startIndex=0;
                        break;
                    } else {
                        length++;
                        i++;
                    }

                }
            }
            if(length>0){
                int tempLength = length;
                for(int x=arr.length-1;x>=0;x--){
                    if(arr[x]==subArr[subArr.length-1] && x!=i) {
                        endIndex = x;
                        length++;
                        for (int y = subArr.length - 2; y >= 0; y--) {
                            if (arr[x - 1] != subArr[y]) {
                                length = tempLength;
                                endIndex = 0;
                                break;
                            } else {
                                length++;
                                x--;
                            }
                        }
                        if(endIndex!=0){
                            break ;
                        }
                    }
                }
                if (tempLength == length) {
                    System.out.println("Length : " + length);
                    break Task;
                } else {
                    length = endIndex - startIndex + 1;
                    System.out.println("Length : " + length);
                    break Task;
                }
            }
        }
        System.out.println("Length : "+length);
    }
}
