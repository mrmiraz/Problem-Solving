#include<bits/stdc++.h>
using namespace  std;

void solver(){
    long long n, k, b, s;
    cin >> n >> k >> b >> s;
    long long ub = (b*k)+(n*(k-1)), lb = b*k;
    if(s >= lb && s <= ub){
        if((lb+k-1) <= s){
            lb = lb+k-1;
        }
        s = s - lb;
        cout << (lb);
        long long minus = k-1;
        for(int i = 2; i <= n; i++){
            if(s > minus){
                cout << " " << minus;
                s = s - minus;
            }
            else if(s > 0){
                cout << " " << s;
                s = 0;
            }
            else{
                cout << " " << 0;
            }
        }
        cout << "\n";
    }
    else{
        cout << -1 << "\n";
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


