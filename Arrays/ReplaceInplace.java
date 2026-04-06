package Arrays;

public class ReplaceInplace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i+" , ");
        }
        System.out.println();

        int left = 0, right =arr.length -1;

        while(left<right){
            int temp = arr[left] ;
            arr[left] = arr[right];
            arr[right] = temp ;
            
            left++; right--;
        }

        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(i+" , ");
        }
        System.out.println();
    }
}