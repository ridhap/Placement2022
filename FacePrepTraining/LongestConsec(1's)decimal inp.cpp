#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, max=0,c;
    cin>>n;
    while(n>0){
        c=1;
        while(n%2==1){
            c++;
            n=n>>2;//n=n/2;
        }
        if(c>max){
            max=c;
            n=n/2;
        }
    }
    cout<<max;
    return 0;
}