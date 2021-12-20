class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> index = new Stack<Integer>();
        index.push(-1);
        
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
                index.push(i);
            } 
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                    index.pop();
                    maxlen = Math.max(maxlen, i - index.peek());
                }
                else{
                    index.push(i);
                    
                }
            }
        }
        
        return maxlen;
    }
}
