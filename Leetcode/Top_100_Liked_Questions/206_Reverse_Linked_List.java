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
        if(head == null || head.next == null) return head;
        ListNode prevNode = null;
        ListNode pointerNode = head;
        
        while(pointerNode != null){
            ListNode pointerNext = pointerNode.next;
            pointerNode.next = prevNode;
            prevNode = pointerNode;
            pointerNode = pointerNext;
            
        }
        
        return prevNode;
    }
}
