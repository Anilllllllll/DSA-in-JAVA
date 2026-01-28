class Solution {
    public String reverseWords(String s) {
       s = s.trim();
        String[] st = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = st.length;
        for(int i=n-1; i>=0; i--){
            sb.append(st[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}