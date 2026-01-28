import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        char[] cha = s.toCharArray();
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < n; i++) {
            char ch = cha[i];
            if (isVowel(ch)) {
                st.push(ch);
            }
        }

        
        for (int i = 0; i < n; i++) {
            char ch = cha[i];
            if (isVowel(ch)) {
                ch = st.pop();
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
