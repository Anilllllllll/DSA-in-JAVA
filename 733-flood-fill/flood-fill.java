class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int original = image[sr][sc];
         if(original == color) return image;
        dfs(image,sr,sc,color,m,n,original);
        return image;
    }

   static void dfs(int[][] image, int sr, int sc, int color,int m,int n,int original){
       if(sr<0 || sc<0 || sr>=n || sc>=m || image[sr][sc] != original){
       return;
      }
      
        image[sr][sc]=color;

        dfs(image,sr+1,sc,color,m,n,original);
        dfs(image,sr,sc+1,color,m,n,original);
        dfs(image,sr-1,sc,color,m,n,original);
        dfs(image,sr,sc-1,color,m,n,original);
        
    }

}