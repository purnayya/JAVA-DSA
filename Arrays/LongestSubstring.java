package Arrays;

public class LongestSubstring {
	   public static int lengthOfLongestSubstring(String s) {
	        //stores the last occurrence of a character, no repeating can atmost have 128 unique ascii characters
	        int[] lastIndex = new int[128];
	        
	        int left = 0;
	        int maxLen = 0;

	        for(int right = 0; right<s.length();right++){
	            char ch = s.charAt(right);

	            /*if a character occures again we shift it to its last occurence from lastIndex map.
	            Math.max prevents the left to move back again i.e if the last occurnece of the new caharcter is 
	            less than the previous left it should not move back, or the repeated character just removed will 
	            be added again.
	            */
	            left = Math.max(left,lastIndex[ch]);
	            maxLen = Math.max(maxLen, right-left+1);

	            //stores the next valid position that will remove the reoccurence of a character.
	            lastIndex[ch] = right+1;
	        }

	        return maxLen;
	    }

	    public static void main(String[] args) {
	        String s = "abcabcbb";
	        System.out.println(lengthOfLongestSubstring(s));
	    }
	}