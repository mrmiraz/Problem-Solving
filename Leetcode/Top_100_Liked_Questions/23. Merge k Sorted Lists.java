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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(ListNode head : lists){
            
            while(head != null){
                minHeap.add(head.val);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while(!minHeap.isEmpty()){
            dummy.next = new ListNode(minHeap.remove());
            dummy = dummy.next;
        }
        return result.next;
    }
}
