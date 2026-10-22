class Solution {
    public int passwordStrength(String password) {
        
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            map.put(ch,1);
        }

        for(char cha : map.keySet()){
            
            if(cha>='a' && cha<='z'){
                count++;
            }
            else if(cha>='A' && cha<='Z'){
                count+=2;
            }
            else if(cha>='0' && cha<='9'){
                count+=3;
            }
            else{
                count+=5;
            }
        }
        return count;
    }
}