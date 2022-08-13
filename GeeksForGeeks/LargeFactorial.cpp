/*
Problem:
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
*/
//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution {
public:
    void multiply(int x, vector<int>& res, int& resSize){
        int carry = 0;
        
        for(int i = resSize-1; i >= 0; i--){
            int mul = res[i]*x+carry;
            int rem = mul%10;
            carry = mul/10;
            res[i] = rem;
        }
        
        while(carry != 0){
            int rem = carry%10;
            carry = carry/10;
            res.insert(res.begin(), rem);
            resSize++;
        }
    }
    
    vector<int> factorial(int N){
        vector<int> res;
        int resSize = 1;
        res.push_back(1);
        for(int i = 2; i <= N; i++){
            multiply(i, res, resSize);
        }
        return res;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        vector<int> result = ob.factorial(N);
        for (int i = 0; i < result.size(); ++i){
            cout<< result[i];
        }
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends
