class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int j=0;
        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!sb.isEmpty() && sb.charAt(j)==ch){
                sb.deleteCharAt(sb.length()-1);
                j--;
                
            }
            else{
                sb.append(ch);
                j++;
            }
            

        }
        return sb.toString();
    }
}