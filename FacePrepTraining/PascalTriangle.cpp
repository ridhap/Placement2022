#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
	int n,i,j,num=1; 
	cin>>n;
	for(i=1;i<n;i++){
		for (j=1;j<n-i;j++){
		    cout<<'*';
	}
	    cout<< num*num <<"\n";
	    num = num*10+1;
	}
}	