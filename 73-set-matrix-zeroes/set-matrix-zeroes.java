class Solution {
    public void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    int k=i;
                    int l=j;
                    while(l-->0 ){
                       if(matrix[k][l]==0){
                        continue;
                       }
                       matrix[k][l]=-99999;

                    }
                     k=i;
                     l=j;
                    while(l++<m-1){
                        if(matrix[k][l]==0){
                        continue;
                       }
                        matrix[k][l]=-99999;

                    }
                     k=i;
                     l=j;
                    while(k-->0){
                        if(matrix[k][l]==0){
                        continue;
                       }
                        matrix[k][l]=-99999;

                    }
                     k=i;
                     l=j;
                    while(k++<n-1){
                        if(matrix[k][l]==0){
                        continue;
                       }
                        matrix[k][l]=-99999;

                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==-99999 || matrix[i][j]==-0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}