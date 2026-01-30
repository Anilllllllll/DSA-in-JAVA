class Solution {
    public boolean validPalindrome(String s) {
        int left =0;
        int right=s.length()-1;
        int issue=0;
        boolean a = false;
        boolean b = false;
        while(left<right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(ch1==ch2){
                left++;
                right--;
            }
            else{
                issue++;
                if(issue>=2){
                    return false;
                }
                if(s.charAt(left)==s.charAt(right-1)){
                    a=ispalindrome(s,left,right-1);
                }
                if(s.charAt(left+1)==s.charAt(right)){
                    b=ispalindrome(s,left+1,right);
                }
                
                return a||b;
            }

        }
        return true;
    }
    boolean ispalindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}