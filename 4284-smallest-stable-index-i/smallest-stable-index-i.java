class Solution {
    public int firstStableIndex(int[] nums, int k) {

        
        int min2 = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        int n = nums.length;
        int index=-1;
        for(int i=0; i<n; i++){
            int l=i;
            int j=0;
            int min = Integer.MAX_VALUE;
           
            while(j<=i){
                if(nums[j]>max){
                    max=nums[j];
                }
                j++;
            }
            while(l<=n-1){
                if(nums[l]<min){
                    min=nums[l];
                }
                l++;
            }
            int ans = max-min;
            if(ans<=k){
                index=i;
                break;
                
            }
        }
        return index;
    }
}