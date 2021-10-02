#include<bits/stdc++.h>
using namespace std;
int c(int n , int sum){
    if(n==sum)
        return 1;
    if(n<sum)
        return 0;
    return c(n,sum+1)+c(n,sum+2);
}

int main(){
    int n;
    cin>>n;
    int sum=0;
    sum=c(n,sum);
    cout<<sum;
}
//without recurrsion sol is fibonacci series.
