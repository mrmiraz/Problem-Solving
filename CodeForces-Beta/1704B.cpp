#include<bits/stdc++.h>
using namespace std;

void solver(){

    int n, x, p, c;
    cin >> n >> x;
    cin >> p;
    int psr = p-x, per = p+x, ans = 0;
    for(int i = 1; i < n; i++){
        cin >> c;
        int sr = c-x, er = c+x;
        psr = max(psr, sr);
        per = min(per, er);
        if(psr > per){
            psr = sr;
            per = er;
            ans++;
        }
    }
    cout << ans << endl;

}

int main(){
    ios_base::sync_with_stdio(false);
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
