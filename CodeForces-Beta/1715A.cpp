#include<bits/stdc++.h>
using namespace  std;

void solver(){
    int n, m;
    cin >> n >> m;
    if(n == 1 && m == 1){
        cout << 0 << "\n";
        return;
    }
    else{
        int minV = min(n, m);
        int maxV = max(n, m);
        int ans = (minV*2)+(maxV-2);
        cout << ans << "\n";
    }

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

