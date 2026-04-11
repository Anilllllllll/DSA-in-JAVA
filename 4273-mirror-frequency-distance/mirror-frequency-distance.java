import java.util.*;

class Solution {
    public int mirrorFrequency(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        HashSet<Character> visited = new HashSet<>();

        for (char ch : map.keySet()) {

            if (visited.contains(ch)) continue;

            char m;

            if (Character.isLetter(ch)) {
                m = (char) ('z' - (ch - 'a'));
            } else {
                m = (char) ('9' - (ch - '0'));
            }

            int a = map.getOrDefault(ch, 0);
            int b = map.getOrDefault(m, 0);

            ans += Math.abs(a - b);

            visited.add(ch);
            visited.add(m);
        }

        return ans;
    }
}