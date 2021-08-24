//Dynamic solution
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            dp[i] = i;
            for(int j = 1; j*j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}

//Lagranges 4 square theorem and Legendries 3 square therem
class Solution {
    public int numSquares(int n) {
        if(isPerfectSquare(n))return 1;
        for(int i = 1; i * i <= n; i++){
            // separate into two perfect square if it has any
            if(isPerfectSquare(n-i*i))return 2;
        }
        
        while(n%4 == 0) n /= 4;
        if(n %8 == 7)return 4;//if the number is 4^a(4b+7) form
        return 3;
    }
    
    public boolean isPerfectSquare(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt == n;
    }
}
//https://www.youtube.com/watch?v=1xfx6M_GqFk