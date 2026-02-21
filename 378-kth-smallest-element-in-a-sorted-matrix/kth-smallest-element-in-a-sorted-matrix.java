class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                pq.add(matrix[i][j]);
            }
        }
        k=k-1;
        while(k-->0){
            pq.remove();
        }
        return pq.peek();
       

    }
}