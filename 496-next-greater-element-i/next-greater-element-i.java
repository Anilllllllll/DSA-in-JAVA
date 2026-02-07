import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int m=nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
       
        int[] arr2 = new  int[m];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
               map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0 ; i<m; i++){
            if(map.containsKey(nums1[i])){
                arr2[i]=map.get(nums1[i]);
            }
        }
        return arr2;
    }
}
