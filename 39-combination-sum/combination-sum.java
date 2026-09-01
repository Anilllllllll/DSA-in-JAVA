class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();

         sum(cand,target,0,list1,list2);
         return list2;

    }

    public static void sum(int[] cand,int target,int i,List<Integer> list1, List<List<Integer>> list2){

        if(target==0){
            list2.add(new ArrayList<>(list1));
            return;
        }

        if(i==cand.length || target<0){
            return ;
        }

        list1.add(cand[i]);
        if(target>=cand[i]){
        sum(cand,target-cand[i],i,list1,list2);
        }
        list1.remove(list1.size()-1);
        sum(cand,target,i+1,list1,list2);

    }
}