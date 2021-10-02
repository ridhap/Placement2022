#include <iostream>
#include <bits/stdc++.h>
using namespace std;
#define SIZE 1000000
void isprime(int n){
 // if(n==1){
  // ;
//}
  vector<int> v (SIZE);
  fill(v.begin(),v.end(),1);
  if(n>0){
   // for(int j=0;isprime(j)<=n;j++){
      for(int i = 2; i*i<=n;i++){
          for(int j=0;v[i]>0;j++){
            	v[i]=0;
      }
      }
      for(int i=2;i<=n;i++){
        if(v[i]==0){
          cout<<i<<' ';
        }
      
      }
  }
}


int main() 
{
   // Try out your code here
	int n;
  	cin>>n;
  	isprime(n);
    return 0;
}