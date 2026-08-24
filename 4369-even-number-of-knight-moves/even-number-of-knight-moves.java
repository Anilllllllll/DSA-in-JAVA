class Solution {
    public boolean canReach(int[] start, int[] target) {

        if((start[0]+start[1])%2==0 && (target[0]+target[1])%2==0){

            return true;
        }
        if((start[0]+start[1])%2!=0 && (target[0]+target[1])%2!=0){

            return true;
        }

        return false;


    }
    
}