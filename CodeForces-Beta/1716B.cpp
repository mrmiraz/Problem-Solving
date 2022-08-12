#include<bits/stdc++.h>
using namespace std;
void printArray(vector<int> arr, int n){
    cout << arr[1];
    for(int i = 2; i <= n; i++){
        cout << " " << arr[i];
    }
    cout << endl;
}

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        cout << n << endl;
        vector<int> arr(n+1, 0);
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }
        printArray(arr, n);
        swap(arr[1], arr[n]);
        printArray(arr, n);

        for(int i = n; i > 2; i--){
            swap(arr[i], arr[i-1]);
            printArray(arr, n);
        }
    }
    return 0;
}
