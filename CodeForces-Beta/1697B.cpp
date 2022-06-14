#include<bits/stdc++.h>
using namespace std;

int main(){
    long long n, q;
    cin >> n >> q;
    long long arr[n+1];
    arr[0] = 0;
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i+1];
    }

    sort(arr, arr+n+1);
    for(int i = 1; i <= n; i++){
        arr[i] += arr[i-1];
    }
    for(int i = 0; i < q; i++){
        int x, y;
        cin >> x >> y;
        int start = n-x;
        int end = start + y;
        cout << (arr[end] - arr[start]) << endl;
    }
    return 0;
}
