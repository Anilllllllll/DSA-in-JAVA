class Solution {
    public int largestSubmatrix(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                
                if(i>0 && matrix[i][j]==1){
                    matrix[i][j]=matrix[i-1][j]+1;
                }

            }
           int [] height = new int[m];

           for(int l=0; l<m; l++){
            height[l] = matrix[i][l];
           }
           Arrays.sort(height);
          for (int a = 0, b = height.length - 1; a < b; a++, b--) {
                int temp = height[a];
                height[a] = height[b];
                height[b] = temp;
            }

            for(int k=0; k<m; k++){
                int base = k+1;
                int h = height[k];

                int area = base*h;

                max = Math.max(area,max);
            }
        }
        return max;
    }
}