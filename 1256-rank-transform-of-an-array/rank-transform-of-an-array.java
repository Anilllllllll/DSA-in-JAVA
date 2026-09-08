class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        int rank = 1;
        while(!pq.isEmpty()){
            int a = pq.poll();
            if(!map.containsKey(a)){
                map.put(a,rank);
                rank++;
            }
        }
        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            arr[i] = map.get(arr[i]);
        }
        return arr;
        
    }
}