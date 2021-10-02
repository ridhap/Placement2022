/*Trapping Rain Water
Given an array arr[] of N non-negative integers representing the height of blocks. 
If width of each block is 1, compute how much water can be trapped between the blocks
 during the rainy season.

Constraints:
3 <= N <= 107
0 <= Ai <= 108

Example 1:
Input:
T=1
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 
T denotes the number of test cases.

Example 2:
Input:
T=1
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by the above block of height 4 is 3 units and above block of height 0 is 7 units. So, the total unit of water trapped is 10 units.

Example 3:
Input:
T=1
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.
*/








#include <iostream>
#include<cmath>
#include <bits/stdc++.h>
using namespace std;
long long int seclar(long long int a[],long long int n){
      sort(a, a + n);
      return a[n-2];
}
int main() 
{
   // Try out your code here
        long long int t, n;
        cin>>t;
        cin>>n;

    	long long int a[n],b[n];
       	long long int sum=0;
        while(t--){  
        for(long long int i =0;i<n;i++){
          cin>>a[i];
          b[i]=a[i];
        }
        long long int sl=seclar(b,n);
          
  		for(long long int i =0;i<=n;i++){
          if(sl>=b[i]){
          long long diff=(sl-b[i]);
          sum+=diff;}}
        cout<<sum;
      }
}
