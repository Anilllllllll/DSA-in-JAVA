class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        
        String st = "";

        int n = s.length()-1;

        for(int i=n; i>=0; i--){
            char ch = s.charAt(i);
            st = st+ch;
        }

        return st.equals(s)? true:false;


    }
}