// 2) Create subarray lies between index 4 to 9 of array.

package arrays;

public class Array2 {
    public static void main(String[] args) {
        int arr[] = {11,29,53,45,85,26,97,78,19,22,30,99};

        int subArr[] = new int[6];
        for(int i=0;i<9;i++){
            if(i>=3){
                for(int j=0;j<6;j++){
                    subArr[j]=arr[i];
                    i++;
                }
                break;
            }
        }

        for(int k=0;k<6;k++){
            System.out.print(subArr[k]+ " ");
        }
    }
}
