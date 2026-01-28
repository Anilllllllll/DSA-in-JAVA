class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            int a = nums[i]+nums[j];
            max= Math.max(a,max);
            i++;
            j--;
        }
        return max;
    }
}