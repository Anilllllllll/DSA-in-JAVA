class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low =0;
        int high =arr.length-1;
        while(low<high){
            int mid = high-(high-low)/2;
            if(mid<arr.length-1 && arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else if(mid>0 && arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
            
        }
        return low;
    }
}
// jha increasing order hai wha chalte chale peak apne aap mil jaega its that simple bro.