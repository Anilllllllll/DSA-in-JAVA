class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> ans2 = new ArrayList<>();
        
        check(nums,0,ans,ans2);


         return ans2;

    }

    public static void check(int[] nums,int i,List<Integer> ans,List<List<Integer>> ans2){

        if(i==nums.length){
            ans2.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        check(nums,i+1,ans,ans2);
        ans.remove(ans.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        check(nums,i+1,ans,ans2);
    }

}