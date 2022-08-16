#include<bits/stdc++.h>
using namespace  std;

void solver(){
    int a, b;
    cin >> a >> b;
    if((a%2 == 0 && b%2 == 1) || (a%2 == 1 && b%2 == 0)){
        cout << "Burenka" << "\n";
    }
    else{
        cout << "Tonya\n";
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
