/**
 Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

 Letters are case sensitive, for example, "Aa" is not considered a palindrome here.



 Example 1:

 Input: s = "abccccdd"
 Output: 7
 Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 **/
public class Hello {
    public static int longestPalindrome(String s) {
        int[] countArray = new int[58];
        for(char ch : s.toCharArray()) {
            countArray[ch - 'A']++;
        }

        int padLen = 0, flag = 0;
        for (int i = 0; i <= 57; i++) {
            if (countArray[i] % 2 == 0){
                padLen += countArray[i];
            }
            else{
                if (countArray[i] != 0){
                    flag = 1;
                    padLen += countArray[i]-1;
                }
            }
        }
        if (flag == 1){
            padLen += 1;
        }
        return padLen;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
