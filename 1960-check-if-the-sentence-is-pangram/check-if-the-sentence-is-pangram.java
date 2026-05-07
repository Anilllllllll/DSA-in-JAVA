class Solution {
    public boolean checkIfPangram(String s) {
        

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,1);
        }
        char ch ='a';
        while(ch<='z'){
            if(!map.containsKey(ch)){
                return false;
            }
            ch++;
        }
        return true;



    }

}