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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode modified_head = new ListNode();
        modified_head.next = head;
        ListNode first = modified_head;
        ListNode back = modified_head;
        for(int i = 1; i <= n+1; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            back  = back.next;
        }
        back.next = back.next.next;
        return modified_head.next;
        
    }
}
