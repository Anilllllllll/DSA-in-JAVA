class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
         store(candidates,target,0,ans,ans2,0);
        return ans;
    }

    public static void  store(int[] arr,int target,int sum,List<List<Integer>> ans,List<Integer> ans2,int i){

        if(sum==target){
            ans.add(new ArrayList<>(ans2));
            
            return;
        }
        if(sum>target || i>=arr.length){
            
            return;
        }
        ans2.add(arr[i]);

        store(arr,target,sum+arr[i],ans,ans2,i);

        ans2.remove(ans2.size()-1);

        store(arr,target,sum,ans,ans2,i+1);


        
        
        
    }
}