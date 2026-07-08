class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return check(nums,0,dp);
        
    }
     public static int check(int[] nums,int i,int[] dp){

        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int pick = nums[i]+check(nums,i+2,dp);

        int not_pick = check(nums,i+1,dp);

        return dp[i] = Math.max(pick,not_pick);
        

     }
}