class Solution {
    public int countMonobit(int n) {

       int count=0;
      
        int nums = 0;
        while(nums<=n){
            count++;
            nums = 2*nums+1;
        }
        return count;
    }
}