class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,0,dp),mincost(cost,1,dp));
    }

    public static int mincost(int[] cost,int i,int[]dp){

        if(i>=cost.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }
        int first = mincost(cost,i+1,dp);
        int second = mincost(cost,i+2,dp);

        return dp[i] = cost[i]+Math.min(first,second);



    }

}