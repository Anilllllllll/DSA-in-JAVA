class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] maxarr = new int[n];
        int[] gcdarr = new int[n];

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
            maxarr[i]=max;
            int c = gcd(nums[i],max);
            gcdarr[i]=c;
        }
        Arrays.sort(gcdarr);
        int i=0;
        int j=n-1;
        long sum =0;
        while(i<j){
            int a = gcdarr[i++];
            int b = gcdarr[j--];
             sum+=gcd(a,b);
            
        }
        return sum;

        
    }
    static int gcd(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;   
    }
}