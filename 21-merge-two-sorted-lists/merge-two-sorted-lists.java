/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();


        ListNode l1 = list1;
        ListNode l2 = list2;

        while(l1!=null){
            q1.add(l1.val);
            l1= l1.next;
        }
        
        while(l2!=null){
            q2.add(l2.val);
            l2=l2.next;
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        while(!q1.isEmpty() && !q2.isEmpty()){

            int a = q1.peek();
            int b = q2.peek();
            if(a<=b){
                ans.add(q1.poll());
            }
            else{
                ans.add(q2.poll());
            }

        }

        while(!q1.isEmpty()){
            ans.add(q1.poll());
        }
        while(!q2.isEmpty()){
            ans.add(q2.poll());
        }
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        for(int i: ans){
            current.next = new ListNode(i);
            current = current.next;
        }
        ListNode head = dummy.next;
        return head;
    }
}