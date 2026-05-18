class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        
        for(int i=0; i<n; i++){
            char  ch = s.charAt(i);
            if(map.containsKey(ch) && !map2.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
            map2.put(ch,map2.get(ch)-1);
             if(map2.get(ch)==0){
                map2.remove(ch);
            }

        }
        return true;


    }
}