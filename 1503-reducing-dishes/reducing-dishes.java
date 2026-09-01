class Solution {
    public int maxSatisfaction(int[] s) {
        

        Arrays.sort(s);
        int n = s.length;

        int i=0;
        long max = Integer.MIN_VALUE;
        while(i<n){
            int coef =1;
            
            long sum =0;
            for(int j=i; j<n; j++){
                sum+=(coef*s[j]);
                coef++;
            }
            max = Math.max(sum,max);
            i++;
        }

        if(max<0){
            return 0;
        }
        return (int)max;
    }
}