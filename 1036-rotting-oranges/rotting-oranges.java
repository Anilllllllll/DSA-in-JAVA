class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                   q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int min=0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int n = q.size();
            while(n-->0){
                int[] p = q.poll();
                int row = p[0];
                int col = p[1];
                for(int[] d: dir){
                    int nr = row+d[0];
                    int nc = col+d[1];

                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1){
                        fresh--;
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=2;
                    }
                }

            }
            min++;
        }
        return (fresh==0)? min-1:-1;
    }
   
}