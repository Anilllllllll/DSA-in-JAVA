class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        comb(digits, "", 0, result);
        return result;
    }

    void comb(String digits, String current, int index, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = convert(digit);

        for (int i = 0; i < letters.length(); i++) {
            comb(digits, current + letters.charAt(i), index + 1, result);
        }
    }

    String convert(char digit) {
        switch(digit){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}
