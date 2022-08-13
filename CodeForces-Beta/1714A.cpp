#include<bits/stdc++.h>
using namespace std;

void solver(){
    int n, sh, eh;
    cin>> n >> sh >> eh;
    int ansH = 23, ansM = 59;
    while(n--){
        int ch, cm;
        cin >> ch >> cm;
        int hd = ch-sh, md = cm-eh;
        if(hd < 0){
            hd = 24+hd;
        }
        if(md < 0){
            hd = hd-1;
            if(hd < 0){
                hd = 24+hd;
            }
            md = 60+md;
        }
        if(hd < ansH){
            ansH = hd;
            ansM = md;
        }
        else if(hd == ansH){
            ansH = hd;
            if(md < ansM){
                ansM = md;
            }
        }
    }
    cout << ansH << " " << ansM << endl;

}
int main(){
    int t;
    cin >> t;
    while(t--){
        solver();
    }
    return 0;
}
