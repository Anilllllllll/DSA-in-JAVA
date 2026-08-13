class Solution {
    public int coinChange(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }
        int[][] dp = new int[coins.length][amount+1];

        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = mincoin(coins, amount, 0,dp);
        if (ans == 1000000) {
            return -1;
        }

        return ans;
    }

    public static int mincoin(int[] coins, int amount, int i,int[][] dp) {

        if (amount == 0) {
            return 0;
        }

        if (i >= coins.length) {
            return 1000000;
        }

        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int take = 1000000;

        if (amount >= coins[i]) {
            take = 1 + mincoin(coins, amount - coins[i], i,dp);
        }

        int skip = mincoin(coins, amount, i + 1,dp);

        dp[i][amount] = Math.min(skip, take);

        return dp[i][amount];
    }
}