class Solution {
    public int climbStairs(int n) {
        
        int[]dp = new  int[n+1];
        for(int i=0; i<n+1; i++){
            dp[i]=-1;
        }
        return ans(n,dp);
    }
    
    public static int ans(int n,int[] dp){

        if(n<0){
            return 0;
        }

        if(n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int a = ans(n-1,dp);
        int b = ans(n-2,dp);

        return dp[n] = a+b;

    }
}