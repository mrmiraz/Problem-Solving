
public int[] countBits(int n) {
        int[] dp = new int[n+1];
        for(int i = 0; i <= n; i++){
            int number = i;
            int count = 0;
            while(number != 0){
                if(number % 2 == 1)count++;
                number /= 2;
            }
            dp[i] = count;
        }
        return dp;
    }

// odd even observation solution
class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[] {0};
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0)dp[i] = dp[i>>1];
            else{
                dp[i] = 1+ dp[i>>1];
            }
        }
        return dp;
    }
}

//https://www.youtube.com/watch?v=awxaRgUB4Kw