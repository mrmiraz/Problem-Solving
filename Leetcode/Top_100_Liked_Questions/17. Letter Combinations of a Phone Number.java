class Solution {
    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> ans = new LinkedList<>();
        char[][] letter = new char[8][];
        letter[0] = "abc".toCharArray();
        letter[1] = "def".toCharArray();
        letter[2] = "ghi".toCharArray();
        letter[3] = "jkl".toCharArray();
        letter[4] = "mno".toCharArray();
        letter[5] = "pqrs".toCharArray();
        letter[6] = "tuv".toCharArray();
        letter[7] = "wxyz".toCharArray();
        char[] input = digits.toCharArray();
        
        if (digits.length() == 0) {
            return ans;
        } 
        else{
            ans.add("");
            
            for (char d : input) {
                ans = combination(ans, letter[d - '2']);
            }
            return ans;
        }

        
    }
    private LinkedList<String>combination(LinkedList<String> first, char[] last){
        LinkedList<String> nextAns = new LinkedList<>();
        for(String s: first){
            for(char c: last){
                nextAns.add(s+c);
            }
        }
        return nextAns;
    }
}
