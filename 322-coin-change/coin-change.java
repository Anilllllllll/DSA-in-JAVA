class Solution {

    public int coinChange(int[] coins, int amount) {
        
        int[][] dp = new int[coins.length][amount+1];

        for(int row[] : dp){
            Arrays.fill(row,-1);
        }


        int ans = find(coins,amount,0,dp);


        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
    }


    public static int find(int[] coins,int amount,int i,int[][] dp){


        if(amount == 0){
            return 0;
        }


        if(amount < 0 || i >= coins.length){
            return Integer.MAX_VALUE;
        }


        if(dp[i][amount] != -1){
            return dp[i][amount];
        }


        int not_skip = find(coins, amount-coins[i], i, dp);


        if(not_skip != Integer.MAX_VALUE){
            not_skip = not_skip + 1;
        }


        int skip = find(coins, amount, i+1, dp);


        int min = Math.min(not_skip, skip);


        return dp[i][amount] = min;
    }
}