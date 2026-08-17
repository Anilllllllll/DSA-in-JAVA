class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return maxm(text1,text2,0,0,dp);

    }
    public static int maxm(String s1,String s2, int i,int j,int[][]dp){

        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+maxm(s1,s2,i+1,j+1,dp);
        }
        int a = maxm(s1,s2,i,j+1,dp);
        int b = maxm(s1,s2,i+1,j,dp);

        dp[i][j] =  Math.max(a,b);

        return dp[i][j];

    }
}