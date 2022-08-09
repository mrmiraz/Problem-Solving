/*
Problem:
Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

Example 1:

Input:
Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
[6,8], [9,10].
Example 2:

Input:
Intervals = {{6,8},{1,9},{2,4},{4,7}}
Output: {{1, 9}}
*/
//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
    vector<vector<int>> overlappedInterval(vector<vector<int>>& intervals) {
         int len = intervals.size(), mergeCount = 0;
         sort(intervals.begin(), intervals.end(), [](vector<int> &a,vector<int> &b){
            if(a[0] < b[0])return 1;
            if(a[0] == b[0]){
                if(a[1] > b[1])return 1;
            }
            return 0;
         });
         
         for(int i = 1; i < len; i++){
             if(intervals[i][0] <= intervals[i-1][1]){
                 intervals[i][0] = intervals[i-1][0];
                 intervals[i][1] = max(intervals[i-1][1], intervals[i][1]);
                 intervals[i-1][0] = -1;
                 intervals[i-1][1] = -1;
                 mergeCount++;
             }
         }
         int j = 0;
         vector<vector<int>> ans(len - mergeCount);
         for(int i = 0; i < len; i++){
             if(intervals[i][0] != -1){
                 ans[j].push_back(intervals[i][0]);
                 ans[j++].push_back(intervals[i][1]);
             }
         }
         return ans;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		vector<vector<int>>Intervals(n);
		for(int i = 0; i < n; i++){
			int x, y;
			cin >> x >> y;
			Intervals[i].push_back(x);
			Intervals[i].push_back(y);
		}
		Solution obj;
		vector<vector<int>> ans = obj.overlappedInterval(Intervals);
		for(auto i: ans){
			for(auto j: i){
				cout << j << " ";
			}
		}
		cout << "\n";
	}
	return 0;
}
// } Driver Code Ends
