import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int n = s.length();
        if(n==0) return 0;
        int max = Integer.MIN_VALUE;
        while(j<n){

            char ch = s.charAt(j);
            while(map.containsKey(ch)){
                map.remove(s.charAt(i));
                i++;
            }
            map.put(ch,1);
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}