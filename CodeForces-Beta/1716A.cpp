#include<bits/stdc++.h>
using namespace std;


int main(){
    int t;
    cin >> t;
    while(t--){
        long long n;
        cin >> n;
        if(n == 1){
            cout << "2" << endl;
        }
        else{
            long long ans = n/3;
            long long rem = n%3;
            cout << (ans+rem/2+rem%2) << endl;
        }
    }
    return 0;
}
