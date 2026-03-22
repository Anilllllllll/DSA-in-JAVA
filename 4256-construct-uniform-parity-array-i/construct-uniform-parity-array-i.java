class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;

        for (int num : nums1) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        // If all even or all odd -> already uniform
        if (even == nums1.length || odd == nums1.length)
            return true;

        // If both odd and even exist -> we can make all odd
        return true;
    }
}