class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer, Queue<Integer>> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int n = arr1.length;
        int m = arr2.length;

        for(int i=0; i<n; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],new LinkedList<>());
            }
            map.get(arr1[i]).add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            map2.put(arr2[i],1);
        }
        int [] nums = new int[n];
        int j=0;
       for(int i=0; i<m; i++){
       if(map.containsKey(arr2[i])){
        while(!map.get(arr2[i]).isEmpty()){
            nums[j] = map.get(arr2[i]).poll();
            j++;
        }
       }
       }
       Arrays.sort(arr1);
       for(int i=0; i<n; i++){
        if(!map2.containsKey(arr1[i])){
            nums[j]=arr1[i];
            j++;
        }
       }
       return nums;
    }
}