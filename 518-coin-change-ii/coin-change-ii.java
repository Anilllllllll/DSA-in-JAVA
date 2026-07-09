class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return num(amount,coins,0,dp);
    }
    public static int num(int amount,int[] coins,int i,int[][] dp){

        if(amount==0){
            return 1;

        }

        if(amount<0 || i>=coins.length){
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }

         int take = num(amount-coins[i],coins,i,dp);
         int not_take= num(amount,coins,i+1,dp);
         return dp[i][amount] = take +not_take;

    }
}