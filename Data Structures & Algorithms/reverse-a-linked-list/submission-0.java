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
        if(head==null || head.next==null)
        return head;

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode temp3 = head.next;

        while(temp2!=null){
            temp3 = temp3.next;
            temp2.next = temp1;
            temp1 = temp2;
            temp2=temp3;
        }
        head.next = null;
        head = temp1;
        return head;
    }
}
