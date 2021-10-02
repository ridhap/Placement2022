#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int n,rev=0,n1;
    cin>>n;
    n1=n;
  	while(rev<n1){
      rev= rev*10+n1%10;
      n1=n1/10;
    }
    if(rev/10 xor n1 || rev==n1)
        cout<<"palindrome";
    else
        cout<<"not Palindrome";

 // cout<<rev;
    return 0;
}