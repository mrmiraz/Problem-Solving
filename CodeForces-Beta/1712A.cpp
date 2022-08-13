#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n, k;
    cin >> n >> k;
    vector<int> arr(n+1);
    for(int i = 1;i <= n; i++){
        cin >> arr[i];
    }
    int count = 0;
    for(int i = 1; i <= k; i++){
        if(arr[i] > k)count++;
    }
    cout << count << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
