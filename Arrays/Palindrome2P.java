package Arrays;
 
public class Palindrome2P {

    public static void main(String[] args) {
        String s = "level";

        char[] letters = s.toCharArray();

        int left = 0;
        int right = letters.length-1;
        boolean check = true;

        while(left<right){
            if(letters[left]!=letters[right]){
                check = false;
                break;
            }
            else {
                left++;
                right--;
            }
        }

        if(check) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Plaindrome");
        }
    }
}