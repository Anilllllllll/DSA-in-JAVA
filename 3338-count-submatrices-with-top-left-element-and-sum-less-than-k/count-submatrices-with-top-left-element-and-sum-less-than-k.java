class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        
        int n = grid.length;
        int m = grid[0].length;
        int sum =0;
       int count=0;
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            
            if(i-1 >=0){
                grid[i][j]+=grid[i-1][j];
            }
            if(j-1>=0){
                grid[i][j]+=grid[i][j-1];
            }
            if(i-1>=0 && j-1>=0){
                grid[i][j]-=grid[i-1][j-1];
            }
           

            if(grid[i][j]<=k){
                count++;
            }else{
                break;
            }

        }
       }
       return count;
    }
}