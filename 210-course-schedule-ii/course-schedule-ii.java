class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        for(int i = 0; i < prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int[] ans = new int[n];
        int idx = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            ans[idx++] = node;

            for(int next : adj.get(node)){
                indegree[next]--;
                if(indegree[next] == 0){
                    q.add(next);
                }
            }
        }

        if(idx != n) return new int[0];

        return ans;
    }
}