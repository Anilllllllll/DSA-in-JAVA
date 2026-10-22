class Solution {
    public int passwordStrength(String password) {
        
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            set.add(ch);
        }

        for(char cha : set){
            
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