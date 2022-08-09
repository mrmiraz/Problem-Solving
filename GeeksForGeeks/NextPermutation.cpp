/*
Problem:
Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.

Example 1:

Input: N = 6
arr = {1, 2, 3, 6, 5, 4}
Output: {1, 2, 4, 3, 5, 6}
Explaination: The next permutation of the 
given array is {1, 2, 4, 3, 5, 6}.
*/
//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int getNearestGreater(vector<int> arr, int sIndex, int eIndex){
        for(int i = eIndex; i > sIndex; i--){
            if(arr[i] > arr[sIndex])return i;
        }
        return sIndex;
    }
    
    vector<int> nextPermutation(int N, vector<int> arr){
        // next_permutation(arr.begin(), arr.end());
        
        for(int i = N-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                //find nearest greater value
                int ngIndex = getNearestGreater(arr, i, N-1);
                swap(arr[i], arr[ngIndex]);
                sort(arr.begin()+i+1, arr.end());
                return arr;
            }
        }
        sort(arr.begin(), arr.end());
        return arr;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        vector<int> arr(N);
        for(int i = 0;i < N;i++)
            cin>>arr[i];
        
        Solution ob;
        vector<int> ans = ob.nextPermutation(N, arr);
        for(int u: ans)
            cout<<u<<" ";
        cout<<"\n";
    }
    return 0;
}
// } Driver Code Ends
