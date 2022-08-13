#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n;
    cin >> n;
    string s = "";
    for(int i = 9;i >= 1; i--){
        if(n-i >= 0){
            n = n -i;
            s += '0'+i;
        }
    }
    reverse(s.begin(), s.end()) ;
    cout << s << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
