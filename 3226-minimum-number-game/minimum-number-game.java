class Solution {
    public int[] numberGame(int[] nums) {

     PriorityQueue<Integer> m = new PriorityQueue<>();

     for(int i=0; i<nums.length; i++){
        m.add(nums[i]);
     }  
     int n = nums.length;
     int[] ans = new int[n];
     for(int i=0; i<n; i+=2){
        sort(i,i+1,ans,m);

     }
     return ans;
    }
   static void sort(int i,int j,int[] ans,PriorityQueue<Integer> m){
        ans[j]=m.poll();
        ans[i] =m.poll();
    }
}