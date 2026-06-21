class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int n = nums.length;

        k=k%n;
        int last =n-1;
        int i=0;
        while(i<=last){
            int temp = nums[i];
            nums[i] = nums[last];
            nums[last] = temp;
            last--;
            i++;
            
        }
        int m = k-1;
        int first=0;
        while(first<=m){
            int temp = nums[first];
            nums[first] = nums[m];
            nums[m] = temp;
            m--;
            first++;
        }
        int last2 = n-1;
        int first2 =k;
        while(first2<=last2){
            int temp = nums[first2];
            nums[first2] = nums[last2];
            nums[last2] = temp;
            last2--;
            first2++;
        }


    }
}