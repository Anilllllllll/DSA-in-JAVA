class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            int a = nums[i]%3;
            if(a==0){
                pq1.add(nums[i]);
            }
            
            if(a==1){
                pq2.add(nums[i]);
            }
            
            if(a==2){
                pq3.add(nums[i]);
            }
        }
        int max = 0;
        int sum = 0;
        if(!pq1.isEmpty() && !pq2.isEmpty() && !pq3.isEmpty()){
            sum=pq1.peek()+pq2.peek()+pq3.peek();
            max = Math.max(max,sum);
        }
        if(pq1.size()>=3){
            int a = pq1.remove();
            int b = pq1.remove();
            int c = pq1.remove();
            sum=a+b+c;
            pq1.add(a);
            pq1.add(b);
            pq1.add(c);
            max = Math.max(max,sum);
        }
        if(pq2.size()>=3){
            int a =pq2.remove();
            int b =pq2.remove();
            int c =pq2.remove();
            sum=a+b+c;
            pq2.add(a);
            pq2.add(b);
            pq2.add(c);
            max = Math.max(max,sum);
        }
        if(pq3.size()>=3){
            int a = pq3.remove();
            int b = pq3.remove();
            int c = pq3.remove();
            sum=a+b+c;
            pq3.add(a);
            pq3.add(b);
            pq3.add(c);
            max = Math.max(max,sum);
        }

        return max;
       
    }
}