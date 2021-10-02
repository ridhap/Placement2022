    #include<bits/stdc++.h>
    using namespace std;
    
    int isprime(int n)
    {
      if(n == 2 )
        return 1 ;
      if(n % 2 == 0)
        return 0 ;
      for(int i = 2 ; i*i <= n ; i++)
      {
        if(n % i == 0)
          return 0 ;
      }
      return 1 ;
    }
    
    int to_num(string s)            // 22
    {
        int temp = 0 , i = 0 ;
        while(s[i])
        {
            temp = temp*10 + (s[i] - '0') ;
            i++ ;
        }
        return temp ;
    }
    
    int main()
    {
        int arr[19] , i , j = 0 ;
        int prime[6768] ;
        memset(prime , 0 , sizeof(prime)) ;
      	for(i = 2 ; i <= 70 ; i++)
        {
          if(isprime(i))
            arr[j++] = i ;
        }
    	int n ;
      	cin >> n ;                      // n = 11 
      	
      	for(i = 0 ; i < 19 ; i++)           // 2 , 3 , 5 , 7 , 11 
        {
          if(arr[i] >= n)
            break ;
        }
        if(arr[i] == n) i ;
        else --i ;
      
        string s1 , s2 ;
      	int flag , count = 0 , num ;
      	
        for(int j = 0 ; j <= i ; j++)
        {
            s1 = to_string(arr[j]) ;            // 2 , 3 , 5 , 7 
            
            for(int k = 0 ; k <= i ; k++)
            {
                s2 = to_string(arr[k]) ;
                num = to_num(s1+s2) ;
                if(isprime(num))
                {
                    if(prime[num] == 0)
                    {
                        prime[num] = 1 ;
                        count++ ;
                    }
                }
            }
        }
         
        cout << count ;
    
    	return 0 ;
    }
