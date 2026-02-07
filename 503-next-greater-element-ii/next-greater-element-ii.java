class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        
        int[] ngr = new int[n];
        Stack<Integer> st = new Stack<>();
        int m = (2*n)-1;
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = nums[i%n];
        }
        for(int i=m-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=arr2[i]){
                st.pop();
            }
            if(i<n && st.isEmpty()){
                ngr[i]=-1;
            }
            if(i<n && !st.isEmpty() && st.peek()>arr2[i]){
                ngr[i]=st.peek();
            }
            st.push(arr2[i]);
        }

        return ngr;
    }
}