
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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode mid = head;
        ListNode fast = head;
        // finding the mid pointer
        while(fast != null && fast.next != null){
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // break the list after mid pointer
        mid.next = null;
        ListNode leftPartition = sortList(head);
        ListNode rightPartition = sortList(slow);
        return merge(leftPartition, rightPartition);
    }
    public ListNode merge(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        if(left.val < right.val){
            // left value is smaller, left pointer will be increase by 1
            left.next = merge(left.next, right);
            return left;
        }
        else{
            right.next = merge(left, right.next);
            return right;
        }
        
    }
}

//https://www.youtube.com/watch?v=TGveA1oFhrc