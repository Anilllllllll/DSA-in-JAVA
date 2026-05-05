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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }     
        ListNode tail = head;
        int count =1;
        while(tail.next!=null){
            tail=tail.next;
            count++;
        }

        k=k%count;
        int a = count-k;

        if(a==0) return head;

        tail.next=head;
        ListNode newtail = tail;
        while(a>0){
            newtail=newtail.next;
            a--;
        }
        ListNode newnode = newtail.next;
        newtail.next=null;
        return newnode;
    }
}