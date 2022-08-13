#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n;
    cin >> n;
    vector<int> arr(n+1);
    int f = 0;
    for(int i = n; i > 0; i--){
        if(f == 0){
            arr[i] = max(1,i-1);
            f = 1;
        }
        else{
            arr[i] = i+1;
            f = 0;
        }
    }

    for(int i = 1; i <= n; i++){
        cout << arr[i] << " " ;
    }
    cout << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
