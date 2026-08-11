class Solution {
    public int maxDigitRange(int[] nums) {

        int[] arr = new int[nums.length];
        int max2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int a = nums[i];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            while(a!=0){
                int rem = a%10;
                max = Math.max(max,rem);
                min = Math.min(min,rem);
                a=a/10;
            }
            max2 = Math.max(max2,max-min);
            arr[i] = max-min;
            
        }
        int sum = 0 ;
        for(int i=0; i<n; i++){

            if(arr[i]==max2){
                sum+=nums[i];
            }
        }
        return sum;
    }
}