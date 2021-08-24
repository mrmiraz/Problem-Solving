/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode colide = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                // there is a cycle
                while(colide != slow){
                    colide = colide.next;
                    slow = slow.next;
                }
                return slow;     
            }
        }
        return null;
    }
}

//https://www.youtube.com/watch?v=Qq-vnKmzJR0