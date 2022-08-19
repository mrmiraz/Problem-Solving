#include<bits/stdc++.h>
using namespace  std;

void solver(){
    long long a, b, c, d;
    cin >> a >> b >> c >> d;
    int ans = 0;
    long long left = a*d, right = b*c;
    if(left == right)ans = 0;
    else{
        if(a == 0 || c == 0|| (left%right) == 0 || (right % left) == 0){
            ans = 1;
        }
        else ans = 2;
    }
    cout << ans << "\n";
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

