class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int a = nums[i];
        map.put(a, map.getOrDefault(a, 0) + 1);
       }

       PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b)->b[1]-a[1]);

       for(int key: map.keySet()){
        pq.add(new int[]{key,map.get(key)});
       }
       int[] ans = new int[k];
       int i=0;
       while(k-->0){
        int[] curr = pq.poll();
        ans[i]=curr[0];
        i++;
       }
       return ans;
        
    }
}