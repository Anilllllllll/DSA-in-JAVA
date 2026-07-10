class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        check(k,n,ans,ans2, 1,0);
        return ans;
    }
    public static void check(int k,int n,List<List<Integer>> ans, List<Integer> ans2,int i,int sum){
        if(sum==n && ans2.size()==k){
            ans.add(new ArrayList<>(ans2));
            return;
        }

        if(sum>n || i>9 || ans2.size()>k){
            return;
        }
        ans2.add(i);
        check(k,n,ans,ans2,i+1,sum+i);
        ans2.remove(ans2.size()-1);
        check(k,n,ans,ans2,i+1,sum);
    }

}