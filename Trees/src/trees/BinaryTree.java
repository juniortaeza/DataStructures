/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package trees;

import java.util.*; //import for LinkedList for Level Order Traversal later

public class BinaryTree<T extends Comparable<T>> //lets create a Binary Tree of type T
{                                                //you must extend 'Comparable' to work with type T's
    protected Node<T> Root;
    
    //default constructor
    public BinaryTree()
    {
        this.Root = null; //default constructor
    }
    
    //insert
    public void insert(T data)
    {
        this.insert(data, this.Root); //insert data to tree using recursion
    }
    
    //private function for the public insert 
    private void insert(T data, Node<T> n) //insert data type T into the Tree
    {
        if(this.Root == null) //if root/tree is null, add piece of data
        {
            this.Root = new Node(data);
        }
        else if(data.compareTo(n.Data) < 0) //if data is less than Node's data
        {
            if(n.left != null) //if left Node is not null
            {
                insert(data, n.left); //insert data in left Node - recursive
            }
            else
            {
                n.left = new Node(data); //else set left Node as a new Node that contains data
            }
        }
        else if(data.compareTo(n.Data) > 0) //if data is greater than Node's data
        {
            if(n.right != null) //if right Node is not null
            {
                insert(data, n.right); //insert data in right Node - recursive
            }
            else
            {
                n.right = new Node(data); //else set right Node as a new Node that contains data
            }
        }
    }
    
    //remove 
    public void remove(T data)
    {
        this.remove(data, this.Root); //remove data from tree using recursion
    }
    
    //private function for the public remove
    private Node<T> remove(T data, Node<T> n) //remove a piece of data from a specific subtree
    {
        if(n == null) //added - if Node does not exist
        {
            return n; //do nothing - prevents crash
        }
        if(this.Root == null)
        {
            return n; //if tree is empty, do nothing
        }
        if(data.compareTo(n.Data) < 0) //if data is less than Node's data
        {
            n.left = this.remove(data, n.left); //remove data from left Node
        }
        else if(data.compareTo(n.Data) > 0)
        {
            n.right = this.remove(data, n.right); //remove data from right Node
        }
        else if(n.left != null && n.right != null) //if both left and right is not null
        {
            remove(n.Data, n.right); //remove Node's data from right Node
        }
        else
        {
            n = (n.left != null) ? n.left : n.right; //node = n.Left if not null else node = n.Right 
        }
        return n; //return Node
    }
   
    //printTree
    public void printTree()
    {
        this.printTree(this.Root); //print tree
    }
    
    //private function for printing the tree
    private void printTree(Node<T> n)
    {
        if(n != null) //if Node is not null
        {
            System.out.println(n.Data); //print data - Root
            this.printTree(n.left); //print left subtree
            this.printTree(n.right); //print right subtree
        }
    }
    
    //print the Tree in Level Order
    public void printLevelOrder()
    {
        this.printLevelOrder(this.Root); //print level order tree
    }
    
    //private function for printing the tree level-ordered
    private void printLevelOrder(Node<T> n) 
    { 
        if(n == null) 
        {
            return; 
        }
        else
        {
            Queue<Node<T>> q = new LinkedList<>();      
            q.add(n); 
    
            while(true) 
            {             
                int count = q.size(); 
                if(count == 0) 
                    break; 
              

                while(count > 0) 
                { 
                    Node<T> ptr = q.peek(); 
                    System.out.print("(" + ptr.Data + ") "); 
                    q.remove(); 
                
                    if(ptr.left != null) 
                    {
                       q.add(ptr.left); 
                    }
                    if(ptr.right != null) 
                    {
                        q.add(ptr.right); 
                    }
                    count--; 
                } 
                System.out.println(); 
            }
        }
    } 
}
