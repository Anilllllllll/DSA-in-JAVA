class Solution {
    public int minOperations(int[] nums, int[] target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=target[i] && map.get(nums[i])>0){
                count++;
                map.put(nums[i],0);
            }
            
        }
        return count;
    }
}