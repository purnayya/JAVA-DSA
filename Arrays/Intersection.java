package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2};

        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[arr2.length];
        
        for(int i = 0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){
                if(!visited[j] && arr1[i]==arr2[j]){
                    res.add(arr1[i]);
                    visited[j]= true;
                    break;
                }
            }
        }

        System.out.println(res);
    }

    
}