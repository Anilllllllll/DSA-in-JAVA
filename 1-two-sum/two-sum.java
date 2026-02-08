class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1,-1};
        int n = nums.length;
        boolean a = false;
        for(int i =0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    a=true;
                }
            }
            if(a){
                break;
            }
        }
        return arr;
    }
}