class Solution {
    public int largestInteger(int n, int s) {

        if(n==0 || s==0){
            return 0;
        }
     
        int ans = -1;
        if(n==1){
            for(int i=1; i<=9; i++){
                
                if(i==s){
                    return i;
                }
            }
        }
        else if(n==2){
            for(int i=10; i<100; i++){
                int count = 0;
                int m = i;
                while(m!=0){
                    count+=m%10;
                    m=m/10;
                }
                if(count==s){
                        ans =i;
                    }
            }
        }
        else if(n==3){
            for(int i=100; i<=999; i++){
                long count = 0;
                int m = i;
                while(m!=0){
                    count+=m%10;
                    m=m/10;
                }
                if(count==s){
                        ans =i;
                    }
            }
        }
        else if(n==4){
            for(int i=1000; i<=9999; i++){
                long count = 0;
                int m = i; 
                while(m!=0){
                    count+=m%10;
                    m=m/10;
                }
                if(count==s){
                        ans =i;
                    }
            }
        }
        else if(n==5){
            for(int i=10000; i<=99999; i++){
                long count = 0;
                int m = i;
                while(m!=0){
                    count+=m%10;
                    m=m/10;
                }
                if(count==s){
                        ans =i;
                    }
            }
            
        }
        return ans;
    }
}