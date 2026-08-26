class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int j = 0;
        int count = 0;
        for(int i=1; i<=10000; i++){
            if(j<arr.length && arr[j]==i){
                j++;
            }
            else{

                count++;

            }

            if(count==k){
                return i;
            }
        }
        return -1;
    }
}