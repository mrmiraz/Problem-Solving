class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{','}');
        map.put('[',']');
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c))stack.push(c);
            else if(stack.isEmpty() || c != map.get(stack.pop())) return false;
            
        }
        return stack.isEmpty();
    }
}
