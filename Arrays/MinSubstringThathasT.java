package Arrays;

/* string s, string t
find the min length of substring that contains all the characters of t in s;

s = "aebdecbcba"
t = "abc"

window  = "cba"
len = 3;
 */

import java.util.ArrayList;
import java.util.List;

public class MinSubstringThathasT {
    public static String minLength(String s, String t) {
        if(t.length()>s.length()) return "";

        int[] map = new int[128];
        for(char ch : t.toCharArray()) map[ch]++;

        int count = t.length();
        int l = 0, r = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        while(r<s.length()){
            char ch = s.charAt(r);            
            if(map[ch]>0){
                count--;
            }
            map[ch]--;
            r++;

            while(count==0){
                if(minLen>r-l){
                    minLen = r-l;
                    start = l;
                }

                char removed = s.charAt(l++);
                map[removed]++;
                if(map[removed] > 0){
                    count++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }

    public static void main(String[] args) {
        System.out.println(minLength("aebdecbcba", "bac"));
    }
}