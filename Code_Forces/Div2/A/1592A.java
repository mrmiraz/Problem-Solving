#include<bits/stdc++.h>
using namespace std;

void solver(){
	int n, h;
	cin >> n >> h;
	int a[n];
	for(int i =0; i < n; i++){
		cin >> a[i];
	}
	sort(a , a+n);
	int s = a[n-1]+ a[n-2];
	int r = h%s;
	int pr = 2*(h/s);
	if(r == 0){
		cout << pr << endl;
	}
	else if(r <= a[n-1]){
		 cout << pr+1 << endl;
	}
	else cout << pr+2 << endl;
	
}

int main(){
	int  t ;
	cin >> t;
	while(t--){
		solver();
	}
}
