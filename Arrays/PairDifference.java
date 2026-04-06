package Arrays;

import java.util.HashMap;

public class PairDifference {
    public static int findUniquePairs(int[] nums, int k){
        int pair = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        if(k == 0){
            for(int key : freq.keySet()){
                if(freq.get(key)>1) pair++;
            }
        }

        else{
            for(int key : freq.keySet()){
                int complement = key + k;
                if(freq.containsKey(complement)){
                    pair++;
                }
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 3, 4, 2};
        int k = 2;
        System.out.println(findUniquePairs(nums, k));
    }
}
