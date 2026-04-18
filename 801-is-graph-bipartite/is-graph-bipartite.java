class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[] color = new int[n];
        
        for(int i = 0; i < n; i++){
            color[i] = -1;
        }

        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(!dfs(i, graph, color, 0)) return false;
            }
        }

        return true;
    }
    public boolean dfs(int curr, int[][] graph, int[] color, int col){
        color[curr] = col;

        for(int v : graph[curr]){
            
            if(color[v] == -1){
                if(!dfs(v, graph, color, 1 - col)) return false;
            }
            else if(color[v] == color[curr]){
                return false;
            }
        }
        return true;
    }
}