#include<bits/stdc++.h>
using namespace  std;

void solver(){
    int n;
    cin >> n;
    vector<int> a(n);
    for(int i = 0; i < n ;i++){
        cin >> a[i];
    }
    sort(a.begin(), a.end());
    cout << (a[n-1]+a[n-2]-a[0]-a[1]) << "\n";
}

int main(){
    std::ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}

