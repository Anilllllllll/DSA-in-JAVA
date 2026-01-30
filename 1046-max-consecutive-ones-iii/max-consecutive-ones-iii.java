class Solution {
    public int longestOnes(int[] nums, int k){

    int count=0;
    int max=0;
    int n = nums.length;
    int left=0;
    int right=0;
    if(k==0){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            max = Math.max(count,max);
            if(nums[i]==0){
                count=0;
            }
        }
        return max;
    }
    while(right<n){
        if(right<n && nums[right]==0){
            right++;
            count++;
        }
         while( right<n && nums[right]==1 ){
            right++;
        }
        if(count==k){

            max = Math.max(max,right-left);
            
            while(nums[left]==1){
                left++;
            }
            if(nums[left]==0){
                left++;
                count--;
            }

        }
    }
    max = Math.max(max,right-left);
    return max;
    }
}
