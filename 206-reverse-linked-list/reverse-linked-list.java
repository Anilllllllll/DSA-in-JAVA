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
    public ListNode reverseList(ListNode head) {
        
        ListNode first = head;
        if(head == null || head.next==null) return head;
        ListNode second = first.next;
        first.next = null;

        while(second!=null){
            ListNode temp = second.next;
            second.next = first;
            first=second;
            second=temp;
            
        }

        return first;
    }
}