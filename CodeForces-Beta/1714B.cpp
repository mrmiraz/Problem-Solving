#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n;
    cin >> n;
    vector<int> a(n), b(n+1, 0);
    for(int i = 0;i < n; i++){
        cin >> a[i];
    }
    int k = 0;
    for(int i = n-1; i >= 0; i--){
        if(b[a[i]] >= 1)break;
        k++;
        b[a[i]]++;
    }
    cout << (n-k) << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
