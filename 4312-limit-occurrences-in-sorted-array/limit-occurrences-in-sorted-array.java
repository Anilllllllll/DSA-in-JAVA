class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
  
        int i = 0;
        int n = nums.length;
        while(i<n){
            int val = map.get(nums[i]);
            int min = Math.min(val,k);

            for(int j=0; j<min; j++){
                list.add(nums[i]);
            }
            int current = nums[i];
            while(i<n && nums[i]==current){
                i++;
            }
        }
        
        int m = list.size();
        int[] arr2 = new int[m];
        for(int j=0; j<m; j++){
            arr2[j] = list.get(j);
        }
        return arr2;
    }
}