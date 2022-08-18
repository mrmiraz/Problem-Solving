/*
Problem:
Given an array arr[] of N non-negative integers representing the height of blocks. 
If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 
Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
*/

//{ Driver Code Starts
#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends
class Solution{

    // Function to find the trapped water between the blocks.
    public:
    long long trappingWater(int arr[], int n){
        int lmax= 0, rmax = 0, left = 0, right = n-1;
        long long ans = 0;
        while(left < right){
            if(arr[left] <= arr[right]){
                lmax = max(lmax, arr[left]);
                ans += lmax-arr[left];
                left++;
            }
            else{
                rmax = max(rmax, arr[right]);
                ans += rmax-arr[right];
                right--;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main(){
    
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        
        int a[n];
        
        //adding elements to the array
        for(int i =0;i<n;i++){
            cin >> a[i];            
        }
        Solution obj;
        //calling trappingWater() function
        cout << obj.trappingWater(a, n) << endl;
        
    }
    
    return 0;
}
// } Driver Code Ends
