class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        Arrays.sort(candidates);

        find(candidates,target,ans,ans2,0,0);
        return ans;

    }

    public static void find(int[] arr,int k,List<List<Integer>> ans,List<Integer> ans2,int i,int sum ){
        
        if(sum==k){
            ans.add(new ArrayList<>(ans2));
            return;
        }

        if(sum>k || i>=arr.length){
            return;
        }
       
        ans2.add(arr[i]);
        find(arr,k,ans,ans2,i+1,sum+arr[i]);
        ans2.remove(ans2.size()-1);
        while(i+1<arr.length && arr[i] == arr[i+1]){
            i++;
        }
        find(arr,k,ans,ans2,i+1,sum);

    }
}