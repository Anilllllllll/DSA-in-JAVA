class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] answer = new int[n];
        int[] ans2 = new int[n];
        if(k==0){
           return answer;
        }
        if(k>0){
            for(int i=0; i<n; i++){
                int j=k;
                int l=i;
                int sum =0;
                while(j>0){
                    int ans = (l+1)%n;
                    sum+=code[ans];
                    j--;
                    l++;
                }
                answer[i]=sum;
            }
        }
        if(k<0){
            int m=n-1;
            k=-(k);

            for(int i=0; i<n; i++){
                ans2[m]=code[i];
                m--;
            }
             for(int i=0; i<n; i++){
                int j=k;
                int l=i;
                int sum =0;
                while(j>0){
                    int ans = (l+1)%n;
                    sum+=ans2[ans];
                    j--;
                    l++;
                }
                answer[i]=sum;
            }
            int[] ans3 = Arrays.copyOf(answer,n);
            
            int p=0;
            for(int i=n-1; i>=0; i--){
                answer[i]=ans3[p++];
            }
            
        }
      
        
        return answer;
        
    }
}