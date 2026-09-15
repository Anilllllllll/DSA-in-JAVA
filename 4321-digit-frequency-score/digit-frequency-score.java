class Solution {
    public int digitFrequencyScore(int n) {

        int m = n;
        HashMap<Integer,Integer> map =  new HashMap<>();
        while(m!=0){
            int rem = m%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            m=m/10;
            
        }
        int ans = 0;
        for(int key:map.keySet()){
            int a = map.get(key);
            ans+=key*a;
        }
        return ans;
    }
}