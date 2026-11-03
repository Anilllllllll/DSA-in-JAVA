class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        
       HashSet<Integer> map = new HashSet<>();

       for(int i=0; i<nums.length; i++){
        map.add(nums[i]);
       }

       List<Integer> ans = new ArrayList<>();
       for(int i=lower; i<=upper; i++){
        if(!map.contains(i)){
            ans.add(i);
        }
       }
       List<List<Integer>> ans2 = new ArrayList<>();
       
       int left=0;
       int right = 0;
       while(left<ans.size()){
        
        while(right+1<ans.size() && ans.get(right)==ans.get(right+1)-1){
            right++;

        }
      ans2.add(Arrays.asList(ans.get(left), ans.get(right)));
        
        right++;
        left=right;
       }
       return ans2;
    }
}