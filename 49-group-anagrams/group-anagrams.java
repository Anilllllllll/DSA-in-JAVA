import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char [] ch = s.toCharArray();
            Arrays.sort(ch);

            String st = new String(ch);

            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }

            map.get(st).add(s);
        }

        return new ArrayList<>(map.values());        
    }
}