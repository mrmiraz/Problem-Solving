class Trie {

    class TrieNode{
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }


    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();

    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode pointerNode = root;
        for(char c: word.toCharArray()){
            pointerNode.children.putIfAbsent(c, new TrieNode());
            pointerNode = pointerNode.children.get(c);
        }
        pointerNode.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
   public boolean search(String word) {
       TrieNode node = find(word);
        if(node == null || !node.isEnd)return false;
        return true;
        
    }

    /**
     * Returns if there is any word in the trie that starts with the given
     * prefix.
     */
    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }
    public TrieNode find(String word){
        TrieNode pointerNode = root;
        for(char c : word.toCharArray()){
            if(!pointerNode.children.containsKey(c))return null;
            pointerNode = pointerNode.children.get(c);
        }
        return pointerNode;
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

//https://www.youtube.com/watch?v=oobqoCJlHA0