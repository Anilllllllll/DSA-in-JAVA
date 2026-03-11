import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int n = numCourses;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        for(int i = 0; i < prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];

            list.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int count = 0;

        while(!q.isEmpty()){

            int a = q.poll();
            count++;

            for(int node : list.get(a)){
                indegree[node]--;

                if(indegree[node] == 0){
                    q.add(node);
                }
            }
        }

        return (count == n)? true:false;
    }
}