/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        
        while(cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        
        for(Node keyNode: map.keySet()){
            Node valueNode = map.get(keyNode);
            valueNode.next = map.get(keyNode.next);
            valueNode.random = map.get(keyNode.random);
        }
        return map.get(head);
    }
}

//https://www.youtube.com/watch?v=xmQb5y1D8gU