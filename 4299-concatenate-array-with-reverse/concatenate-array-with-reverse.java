class Solution {
    public int[] concatWithReverse(int[] nums) {

        int n=nums.length*2;
        int[] ans = new int[n];
        int k=0;
        for(int i=0; i<nums.length; i++){
            ans[k++] = nums[i];
        }
        for(int j= nums.length-1; j>=0; j--){
            ans[k++] = nums[j];
        }
        return ans;
    }
}