#include<bits/stdc++.h>
using namespace  std;

void solver(){
    int n;
    cin >>n;
    cout << n;
    for(int i = 1; i < n; i++){
        cout << " " << i;
    }
    cout << "\n";
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

