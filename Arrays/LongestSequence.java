package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,101,1,3,2};
        int maxLen  = 0;

        /*brute force -> O(n2)
        int n = nums.length;
        for(int i=0;i<n;i++){
            int element = nums[i];
            int len = 0;
            for(int j=0;j<n;j++){
                if(nums[j] == element){
                    element+=1;
                    len++;
                    j=0;
                }
            }
            maxLen = Math.max(maxLen,len);
        }
        System.out.println(maxLen);*/

        /*brute force2-> O(nlogn) 
        Arrays.sort(nums);
        int n = nums.length;
        int len = 1;
        for(int i =1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                len++;
            }
            else {
                maxLen = Math.max(maxLen,len);
                len = 1;
            }
        }
        maxLen = Math.max(maxLen,len);
        */
        
        maxLen = longestSequence(nums);
        System.out.println(maxLen);
    }

    // efficient approach (O(n))
    public static int longestSequence(int[] nums){
        int maxLen = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
                int currentNum = num;
                int len = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    len++;
                }

                maxLen = (len>maxLen)? len:maxLen;
            }
        }

        return maxLen;
    }
}