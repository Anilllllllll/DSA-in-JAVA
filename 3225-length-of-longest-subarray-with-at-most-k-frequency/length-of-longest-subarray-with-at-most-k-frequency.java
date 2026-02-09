class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(i<n && j<n){
            int a = nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            j++;
            while( i<n && map.get(a)>k){
                int b = nums[i];
                map.put(b,map.get(b)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
                i++;
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}