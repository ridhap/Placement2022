#include<bits/stdc++.h>
using namespace std ;

class Node
{
    public:
    int data ;
    Node *left , *right ;
    Node(int input)
    {
        data = input ;
        left = right = NULL ;
    }
}*root = NULL ;

void insert(Node *current, int input)
{
    if(current == NULL)
    {
        Node *new_node = new Node(input) ;
        root = new_node ;
    }
    else if(input > current -> data && current -> right == NULL)
    {
        Node *new_node = new Node(input) ;
        current -> right = new_node ;
    }
    else if(input < current -> data && current -> left == NULL)
    {
        Node *new_node = new Node(input) ;
        current -> left = new_node ;
    }
    else if(input > current -> data && current -> right != NULL)
        insert(current -> right , input) ;
    
    else if(input < current -> data && current -> left != NULL)
        insert(current -> left , input) ;
}

int height(Node *current, int &ans)
{
    if (current == NULL)
        return 0 ;
 
    int left_height = height(current -> left , ans) ;
 
    int right_height = height(current -> right , ans) ;

    ans = max(ans , 1 + left_height + right_height) ;
 
    return 1 + max(left_height , right_height) ;
}
 
int diameter(Node *current)
{
    if (current == NULL)
        return 0 ;
    int ans = INT_MIN ;
    ans = height(root , ans) ;
    return ans ;
}

int main()
{
    int input ;
    while(1)
    {
        cin >> input ;
        if(input < 0)
            break ;
        insert(root , input) ;
    }
    cout << "Diameter of the given binary tree is " << diameter(root) ; 
    return 0 ;
}
