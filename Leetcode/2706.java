/**
Problem: 2706. Buy Two Chocolates

 You are given an integer array of prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.

 You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.

 Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
 
 Example 1:

 Input: prices = [1,2,2], money = 3
 Output: 0
 Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.

**/



class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = 101, min2 = 101;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min1){
                min2 = min1;
                min1 = prices[i];
            }
            else if (prices[i] < min2){
                min2 = prices[i];
            }
        }
        if ((min1 + min2) <= money){
            return money-min1-min2;
        }
        else {
            return money;
        }
    }
}
