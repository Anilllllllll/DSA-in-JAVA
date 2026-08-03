class Solution {
    public int[] frequencySort(int[] nums) {

     HashMap<Integer,Integer> map = new HashMap<>();

     for(int i=0; i<nums.length; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }

     PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return b-a;
            }
            return map.get(a)-map.get(b);
        }
     );
     pq.addAll(map.keySet());
     int[] ans  = new int[nums.length];
     int i=0;
     while(!pq.isEmpty()){
        int a = pq.poll();
        int b = map.get(a);
        while(b-->0){
            ans[i++] = a;
        }
     }
     return  ans;
     





    }
}