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
// Solution with two pointer
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)return false;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
            
        }
        if(fast != null) slow = slow.next;
        
        while(slow != null){
            if(slow.val != prev.val)return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
        
    }
}
// Solution with stack

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode pointer = head;
        while(pointer != null){
            stack.add(pointer.val);
            pointer = pointer.next;
        }
        pointer = head;
        while(pointer != null){
            if(stack.pop() != pointer.val){
                return false;
            }
            pointer = pointer.next;
        }
        
        return true;
    }
}


