class Solution {
    public boolean uniformArray(int[] nums1) {

       int n = nums1.length;
        int odd =0;
        int even =0;
        int minodd = Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(nums1[i]%2==0){
                even++;
                mineven = Math.min(nums1[i],mineven);
            }
            else{
                minodd = Math.min(nums1[i],minodd);
                odd++;
            }
        }
        if(odd==n || even==n) return true;

        if(mineven>minodd){
            return true;
        }
        return false;
        
    }
    
}