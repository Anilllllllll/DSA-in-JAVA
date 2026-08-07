class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int max = nums[n-1];
        int[] rightmax = new int[nums.length];
        
        for(int i=n-1; i>=0; i--){
            max = Math.max(max,nums[i]);
            rightmax[i] = max;
        }
        int max2 =Integer.MIN_VALUE;
        for(int i=0; i<n-k; i++){
            max2 =  Math.max(max2,nums[i]+rightmax[i+k]);
        }

        return max2;

    }
}