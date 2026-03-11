import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){

            int[] node = q.poll();
            int a = node[0];
            int b = node[1];

            for(int[] d : dir){

                int nr = a + d[0];
                int nc = b + d[1];

                if(nr >= 0 && nc >= 0 && nr < n && nc < m && mat[nr][nc] == -1){

                    mat[nr][nc] = mat[a][b] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return mat;
    }
}