package Arrays;

import java.util.Arrays;

public class PairSum2P {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,9};
        Arrays.sort(arr);

        int sum = 12;
        int left=0;
        int right = arr.length-1;

        for(;left<right;){
            if(arr[left]+arr[right]>sum){
                right--;
            }
            else if(arr[left]+arr[right]<sum){
                left++;
            }
            else{
                System.out.println(arr[left]+", " + arr[right]);
                left++;
                right--;
            }
        }
    }
}