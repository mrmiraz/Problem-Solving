class LRUCache {
     
        class DLLNode{
            int key;
            int val;
            
            DLLNode next, prev;

            public DLLNode(int key, int val) {
                this.key = key;
                this.val = val;
                
            }
        }
        int capacity;
        DLLNode head, tail;
        HashMap<Integer, DLLNode> map;
        public LRUCache(int capacity){
            map = new HashMap<>();
            this.capacity = capacity;
            
        }
        public int get(int key){
            DLLNode node;
            if(map.containsKey(key)){
                node = map.get(key);
                arrangeHead(node);
                return node.val;
            }
            else return -1;
        }
        
        
        
        public void put(int key, int value){
            DLLNode newNode;
            if(map.containsKey(key)){
                newNode = map.get(key);
                newNode.val = value;
            }
            else{
                newNode = new DLLNode(key, value);
                if(map.size() == capacity)
                    evict();
                map.put(key, newNode);
            }
            arrangeHead(newNode);
        }
        public void arrangeHead(DLLNode node){
            // if node is in the head position
            if(head == node){
                return;
            }
            // if node is in the middle position 
            // connect left node and right node 
            if(node.prev != null){
                node.prev.next = node.next;
                
            }
            if(node.next != null){
                node.next.prev = node.prev;
            }
            // if node is tail
            if(tail == node){
                tail = tail.prev;
            }
            // connect node with previous head
            node.next = head;
            node.prev = null;
	    // make the node as head
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                // make the node as head;
                head.prev = node;
                head = node;
            }
            
        }
        
        public void evict(){
            map.remove(tail.key);
            tail = tail.prev;
            
        }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */