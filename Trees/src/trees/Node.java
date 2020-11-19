/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package trees;

public class Node<T> //lets create a Node class of type T
{
    T Data; //variable for data
    
    Node<T> left;  //variable for left subtree
    Node<T> right; //variable for right subtree
    
    //default constructor
    Node(T data)
    {
        this.Data = data;
    }
    
    //working constructor
    Node(T data, Node<T> r, Node<T> l)
    {
        this.Data = data; 
        this.right = r;
        this.left = l;
    }
}
