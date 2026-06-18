class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(k==0 || k==n) return ;
        if(k>n){
            k=k%n;
        }
        int rem = n-k;
        int[] arr = new int[rem];
        for(int i=0; i<rem; i++){
            arr[i]=nums[i];
        }
        int count=0;
        int m=n-1;
        for(int i=rem; i<n; i++){
            nums[count++] = nums[i]; 
        }
        int j=0;
        for(int i=count; i<n; i++){
            nums[i]=arr[j++];
        }
        

    }
}