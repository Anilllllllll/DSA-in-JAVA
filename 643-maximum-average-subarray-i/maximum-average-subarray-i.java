class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        int avg =0;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        max = Math.max(sum,max);
        int j=0;
        for(int i=k; i<nums.length; i++){
            sum-=nums[j++];
            sum+=nums[i];
            
            max = Math.max(sum,max);
        }
        return (double) max/k;
    }
}