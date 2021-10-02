// C++ program for above approach
#include <bits/stdc++.h>
using namespace std;
//int greyConverter(int n) { return n ^ (n >> 1); }
 
int main()
{
    int n,i,gray;
    cin>>n;
    string s;
    for(i=0;i<(1<<n);i++){
        gray=i^(i>>1);
        bitset<16>b (gray);
        
        s=b.to_string();
        cout<<s.substr(16-n)<< ' ';
    }
}
