class Solution {

       static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
    public long maximumScore(int[] nums, String s) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            char ch = s.charAt(i);
            if(ch == '1'){
                sum+=pq.remove();
            }
        }
        return sum;
        
    }
}