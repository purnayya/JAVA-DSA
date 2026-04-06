package Arrays;

public class MoveZeroesSlowFastP {
    public static void main(String[] args) {
        int[] arr = {1,0,3,7,8,0,33,44,55};

        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i+" , ");
        }
        System.out.println();

        int slow = 0;
        int fast = 0;

        for(;fast< arr.length; fast++){
            if(arr[fast]!=0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }

        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i+" , ");
        }
        System.out.println();
    }
}