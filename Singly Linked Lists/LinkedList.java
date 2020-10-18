/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package singly.linked.lists;

public class LinkedList<T>  //lets make a Linked List with generic type T
{
    //create an instance of the Node<T> class called Head and first set it to null 
    private Node<T> Head = null;
    
    public LinkedList()
    {
        //default
    }
    
    //adding Nodes to the end of a linked list
    public void addNode(T data)
    {
        //you must first add a Node containing data to the null space
        if(Head == null)
        {
            Head = new Node<T>();   //set Head as a new Node of type T
            Head.Data = data;   //set data in Node
            Head.Next = null;   //set space to the right as null          
        }
        else
        {
            //create a pointer that points to the Head
            Node<T> ptr = this.Head;
            
            //to add an item to end of a list, you must first traverse to end of the list
            while(ptr.Next != null) //traverse to end until you hit null
            {
                ptr = ptr.Next; //traverse to end until it hits null
            }
            
            //create the new Node
            Node<T> newNode = new Node<T>();
            newNode.Data = data; //set data in new Node
            newNode.Next = null; //set space to the right as null
            
            //assign the next reference to the new Node
            ptr.Next = newNode;
        }
    } 
    
    //insert Nodes at specific indexes
    public void insertNode(T search, T data)
    {
        //create pointer that points to the Head
        Node<T> ptr = this.Head;
        
        //to insert a Node at a specific index, you must first find the location you'd like
        while(!ptr.Data.equals(search))
        {
            ptr = ptr.Next; //scan and find the location
        }
        
        //create new Node to be inserted
        Node<T> newNode = new Node<T>();    
        newNode.Data = data; //set data in new Node
        newNode.Next = ptr.Next; //connect the Next pointer of the new Node to what the Next pointer ptr is pointing at
        ptr.Next = newNode; //connect what ptr is pointing to to the new Node
    }
    
    //find an existing Node
    public T find(T search)
    {
        //create pointer that points to the Head
        Node<T> ptr = this.Head;
        
        while(ptr != null) //scan for certain Data
        {
            if(ptr.Data == search) //if Data is found
            {
                return ptr.Data; //return the Data
            }           
            ptr = ptr.Next; //set pointer to the next Node
        }
        return null; //return null if Data can't be found
    }
    
    //delete specific Nodes
    public void deleteNode(T search)
    {
        //to remove a Node, we need to traverse the list and stop at previous Node
        
        //create pointer that points to the Head
        Node<T> ptr = this.Head;
        
        if(ptr == null) //what if list is empty?
        {
            return; //exit
        }
        
        if(ptr.Data.equals(search))
        {
            Node<T> del = this.Head; //set delete reference to the Head
            this.Head = del.Next; //set new Head at Next Node
            del = null; //set delete reference to null
            
            //a way to simplify the code above is:
            //this.Head = this.Head.Next;
        }
        else
        {
            if(ptr.Next == null) //what if list contains only one thing?
            {
                return; //exit
            }
            
            //search for Node to be deleted
            while(!ptr.Next.Data.equals(search))
            {
                ptr = ptr.Next; //if specified Data is not found, move onto next Node and keep looking
                
                if(ptr.Next == null) //once we hit end of list, exit
                {
                    return; //exit
                }
            }
            
            Node<T> del = ptr.Next; //set delete reference to the next Node
            ptr.Next = del.Next; //set next Node to next delete reference
            del = null; //set delete reference to null
            
            //a way to simplify the code above is:
            //ptr.Next = ptr.Next.Next;
        }
    }
    
    //last but definitely not least, print the Linked List
    public void printList()
    {
        //create pointer that points to the Head
        Node<T> ptr = this.Head;   
        
        while(ptr != null) ///print until pointer hits null
        {
            System.out.println(ptr.Data); //print the Data the pointer is pointing at
            ptr = ptr.Next; //set pointer to Next node to be printed
        }
    }
}