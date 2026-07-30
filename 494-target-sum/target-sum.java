class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int sum = 0;
        for (int x : nums)
            sum += x;

        int[][] dp = new int[n][2 * sum + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(nums, target, 0, 0, sum, dp);
    }

    public int solve(int[] nums, int target, int i, int total, int sum, int[][] dp) {

        if (i == nums.length)
            return total == target ? 1 : 0;

        if (dp[i][total + sum] != -1)
            return dp[i][total + sum];

        int add = solve(nums, target, i + 1, total + nums[i], sum, dp);
        int sub = solve(nums, target, i + 1, total - nums[i], sum, dp);

        dp[i][total + sum] = add + sub;

        return dp[i][total + sum];
    }
}