#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int gcd(int n, int m){
    // if(m==0){
    //     return n;
    // }
    // gcd(n%m,m);
    
    while (n != m)
    {
        if (n > m) {
            n = n - m;
        }
        else {
            m = m - n;
        }
    }
 
    return n; 
}
int main() 
{
   // Try out your code here
	int n;
  	cin>>n;
  	int sum=0;
  	for(int i =1;i<n;i++){
  	    if(gcd(n,i)==1){
  	        sum=sum+i;
  	        }
  	    }
  	cout<<sum;
    return 0;
}