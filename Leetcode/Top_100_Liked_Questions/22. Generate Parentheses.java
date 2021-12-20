class Solution {
    public List<String> generateParenthesis(int n) {
        
        LinkedList<String> result = new LinkedList<String>();
        backTrak(result, "(", 1, 0, n);
        return result;
    }
    public void backTrak(List<String> result, String current_str, int open, int close,int max){
        if(current_str.length() == max*2){
            result.add(current_str);
            return;
        }
        if(open < max) backTrak(result, current_str + "(", open+1, close, max);
        if(close < open) backTrak(result, current_str + ")", open, close+1, max);
    }
}
