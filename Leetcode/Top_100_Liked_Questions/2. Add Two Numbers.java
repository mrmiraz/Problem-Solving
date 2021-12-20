class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode a = l1, b = l2, tresult = result;
        int carry = 0, x, y;
        while(a != null || b != null){
            
            x = (a != null)? a.val: 0;
            y = (b != null) ? b.val: 0;
            
            int sum = carry + x + y;
            carry = sum / 10;
            tresult.next = new ListNode(sum % 10);
            tresult = tresult.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;
            
            
                
        }
        if(carry > 0){
            tresult.next = new ListNode(carry);
        }
        return result.next;
            
        
    }
}
