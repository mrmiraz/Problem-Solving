#include<bits/stdc++.h>
using namespace  std;

void solver(){
    long n, k;
    cin >> n >>k;
    long a = 1, b = 2;
    vector<pair<int, int>> ans;
    for(int i = 0; i < n/2; i++){
        long long  x1 = ((a+k)*b);
        long long x2 = ((b+k)*a);
        if(x1%4 == 0)ans.push_back({a,b});
        else if(x2%4 == 0)ans.push_back({b,a});
        a+=2;
        b+=2;

    }
    if(ans.size() == n/2){
        cout << "YES\n";
        for(int i = 0; i < n/2; i++){
            cout << ans[i].first << " "<<ans[i].second << "\n";
        }
    }
    else{
        cout << "NO\n";
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
