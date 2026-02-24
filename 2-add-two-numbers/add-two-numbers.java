// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

// 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode first = l1;
       ListNode second = l2;
       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;
       int carry=0;
       while(first!=null || second!=null || carry!=0){
        int sum=carry;
        if(first!=null){
            sum+=first.val;
            first=first.next;
        }
        if(second!=null){
            sum+=second.val;
            second=second.next;
        }
        curr.next = new ListNode(sum%10);
        curr=curr.next;
        carry=sum/10;

       }
       return dummy.next;
    }
    
}