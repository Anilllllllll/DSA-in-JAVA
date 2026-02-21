class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        
        int row=points.length;
        int col=2;
        for(int i=0; i<row; i++){
           int x = points[i][0];
           int y = points[i][1];

           int a = (x*x)+(y*y);
           pq.add(new int[]{a,x,y});

           if(pq.size()>k){
            pq.poll();
           }
        }

        int[][] res = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            int [] ans = pq.poll();
            res[i][0] = ans[1];
            res[i][1]  = ans[2];
            i++;
        }
        return res;


    }
}