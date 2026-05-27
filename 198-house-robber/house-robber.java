class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
    }
    public int func(int n,int[] nums,int[] dp){

        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        if(dp[n]!=-1) return dp[n];
        

        int first = nums[n]+func(n-2,nums,dp);
        int last = func(n-1,nums,dp);

        dp[n] = Math.max(first,last);

        return dp[n];



    }
}