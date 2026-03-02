class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(nums);
        
        int n = nums.length;
        for(int i=0; i<nums.length-2; i++){
            int a = nums[i];
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k = n-1;
            
            while(j<k){
                int b = nums[j];
                int c = nums[k];
                
                int sum = a+b+c;
                if(sum==0){
                    res.add(Arrays.asList(a,b,c));
                    j++;
                    k--;

                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k &&  nums[k]==nums[k+1]){
                        k--;
                    }
                    
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
             
        }
        return res;
    }
}