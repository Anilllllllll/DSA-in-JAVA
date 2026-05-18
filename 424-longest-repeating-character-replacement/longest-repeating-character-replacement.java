class Solution {
    public int characterReplacement(String s, int k) {
       
       int left =0;
       int max = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       HashMap<Character,Integer> map = new HashMap<>();
       int n = s.length();
       for(int right=0; right<n; right++){
        char ch = s.charAt(right);
        map.put(ch,map.getOrDefault(ch,0)+1);

        max2 = Math.max(max2 , map.get(ch));
        int a = (right-left+1 )- max2;
        if(a>k){
            char cha = s.charAt(left);
            map.put(cha,map.get(cha)-1);
            left++;
        }

        max = Math.max(max,right-left+1);

       }
       return max;
    }
}