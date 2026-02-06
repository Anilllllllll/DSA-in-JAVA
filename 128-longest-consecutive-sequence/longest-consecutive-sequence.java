class Solution {
    public int longestConsecutive(int[] arr) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],1);

        }
        int count=0;
        Integer prev=null;
        int max=0;
        for(Integer key:map.keySet()){
            if(prev!=null && key==prev+1){
                count++;

            }
            else{
                count=1;
            }
            prev=key;
            max=Math.max(max,count);
        }
        return max;
    }
}