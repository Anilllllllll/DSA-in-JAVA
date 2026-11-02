class Solution {
    public boolean isPalindromic(String s) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int a = ch;

            String st = Integer.toBinaryString(a);
            while(st.length()<8){
                st = "0"+st;
            }
            sb.append(st);
        }
        return check(sb);
    }
    public static boolean check(StringBuilder s){

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(ch1!=ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}