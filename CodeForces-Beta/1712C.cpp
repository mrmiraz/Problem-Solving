#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n;
    cin >> n;
    vector<int> a(n+1), sMin(n+1);

    for(int i = 1; i <= n; i++){
        cin >> a[i];

    }
    sMin[n] = a[n];
    for(int i = n-1; i > 0; i--){
        sMin[i] = min(a[i], sMin[i+1]);
    }
    unordered_set<int> sett;
    int i = n, k = 0, f = 0;
    for(; i > 0; i--){
        if(f == 0 && a[i] > sMin[i]){
            k = i;
            f = 1;
        }
        if(f == 1){
            sett.insert(a[i]);
        }
    }

    f = 0;
    for(i = n; i > k; i--){
        if(f == 0 && sett.count(a[i])){
            f = 1;
        }
        if(f == 1){
            sett.insert(a[i]);
        }
    }
    cout << sett.size() << endl;

}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
