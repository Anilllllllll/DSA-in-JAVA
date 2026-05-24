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
    public void reorderList(ListNode head) {
        
        ListNode temp = head;
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;

        }

        ArrayList<Integer> res = new ArrayList<>();

        int left =0;
        int right = ans.size()-1;
        while(left<right){
            res.add(ans.get(left++));
            res.add(ans.get(right--));
        }

        if(left==right){
            res.add(ans.get(left));
        }

        temp = head;
        int i=0;
        while(temp!=null){
            temp.val = res.get(i++);
            temp=temp.next;
        }


    }
}