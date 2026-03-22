class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;

        for (int num : nums1) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

       
        if (even == nums1.length || odd == nums1.length)
            return true;

       
        return true;
    }
}