/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package doubly.linked.lists;

public class LinkedList<T> //lets make a Doubly Linked List with generic type T
{
    //create instances of the Node class; it will help with traversing
    Node<T> Head = null;
    Node<T> Tail = null;
    
    //default constructor
    public LinkedList()
    {
        //default
    }
    
    //adding Nodes to the front of a linked list
    public void addTF(T data)
    {
        //check to see if the first node is NULL or empty list
        if(Head == null) //if list is empty, add a head containing data
        {
            Head = new Node<T>();
            Head.Data = data;
            Head.Next = null;
            Head.Prev = null;
        }
        //if head is not null, then traverse list backwards
        else
        {          
            Node<T> node = new Node<T>();   
            node.Data = data;          
            node.Next = this.Head;  //point node's Next to Head
            node.Prev = null;       //point node's Prev to null
            this.Head.Prev = node;  //point Head's Prev to node
            this.Head = node;       //set this.Head = node; new node is new Head
        }
    }
    
    //adding Nodes to the end of a linked list; to add to end, you must traverse to end
    public void addTE(T data)
    {
        //check to see if the first node is NULL or empty list
        if(Head == null) //if list is empty, add a head containing data
        {
            Head = new Node<T>();
            Head.Data = data;
            Head.Next = null;
            Head.Prev = null;
        }       
        //if head is not null, then traverse list
        else
        {
            //set reference equal to Head
            Node<T> ptr = this.Head;
            
            //traverse to end of the list
            while(ptr.Next != null)
            {
                ptr = ptr.Next;
            }
            
            //create the new node
            Node<T> node = new Node<T>();
            node.Data = data;   
            node.Prev = ptr;    //point node's Previous to pointer
            node.Next = null;   //point node's Next to null
            ptr.Next = node;    //point pointer's Next to node
            this.Tail = node;   //set this.Tail = node; new node is new Tail
        }
    }
    
    //deleting a Node
    public void remove(T search)
    {
        if(Head.Data.equals(search))    //if the node is the Head
        {
            this.Head = this.Head.Next; //set next of Head as the New Head
            this.Head.Prev.Next = null; //sever Next link of deleted Node to new Head
            this.Head.Prev = null;      //sever Prev link of deleted Node from new Head
        }
        else
        {
            Node<T> ptr = this.Head;
            
            while(!ptr.Next.Data.equals(search))
            {
                ptr = ptr.Next;
            }
            
            if(ptr.Next == this.Tail)   //if the Node is the Tail
            {
                this.Tail = this.Tail.Prev; //set prev of Tail as the new Tail
                this.Tail.Next.Prev = null; //sever Prev link of deleted Node from new Tail
                this.Tail.Next = null;      //sever Next link of deleted Node to new Tail
            }
            else
            {
                ptr.Next = ptr.Next.Next;    //ptr.Next.Next;           
                ptr.Next.Prev = ptr;          
            }
        }
    }
    
    //print the list forward; this is considered traversing forward
    public void printF()
    {
        //set the Head
        Node<T> ptr = this.Head;
        
        while(ptr != null) //print until it reaches null
        {
            System.out.println(ptr.Data);
            ptr = ptr.Next; //traverse forward
        }
    }
    
    //print the list backward; this is considered traversing backward
    public void printB()
    {
        //set the Tail
        Node<T> ptr = this.Tail;      

        while(ptr != null)
        {
            System.out.println(ptr.Data);
            ptr = ptr.Prev; //traverse backward
        }   
    }
}
