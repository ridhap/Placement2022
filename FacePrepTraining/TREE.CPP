#include<bits/stdc++.h>
using namespace std;

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
        current = new_node ;
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
    {
        insert(current -> right , input) ;
    }
    else if(input < current -> data && current -> left != NULL)
    {
        insert(current -> left , input) ;
    }
}

void inorder(Node *current)
{
    if(!current)
        return ;
    
    inorder(current -> left) ;
    cout << current -> data << ' ' ;
    inorder(current -> right) ;
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
    cout << root -> data ;
    inorder(root) ;
    
    return 0;
}

