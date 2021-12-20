class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] t = new boolean[s.length() + 1][p.length() + 1];
        t[0][0] = true;
        
        for(int i = 1; i <= p.length(); i++){
            if(p.charAt(i - 1) == '*'){
                t[0][i] = t[0][i - 2];
            }
        }
        for(int i = 1; i <= s.length(); i++){
            for(int j = 1; j <= p.length(); j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                    t[i][j] = t[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    
                        if(t[i][j-2] == true){
                            t[i][j] = t[i][j-2];
                        }
                    
                    
                        else if(s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.'){
                           t[i][j] = t[i-1][j];
                        }
                        
                    
                    
                }
                else 
                    t[i][j] = false;
            
            }
        }
        return t[s.length()][p.length()];
    }
}

