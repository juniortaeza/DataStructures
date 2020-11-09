/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package singly.linked.lists;

public class Main //testing the Linked Lists
{
    //lets test the functionalities of the Linked List class
    public static void main(String[] args) 
    {
        //create instance of LinkedList of type String
        LinkedList<String> list = new LinkedList<>();
        
        System.out.println("Adding and Printing the Nodes:");
        System.out.println("------------------------------");
        list.addNode("Dog");
        list.addNode("Cat");
        list.printList();
        
        System.out.println("\nInserting Nodes at Specific Indexes:");
        System.out.println("------------------------------------");
        list.insertNode("Dog", "Lion"); //insert Lion after Dog
        list.insertNode("Cat", "Tiger"); //insert Tiger after Cat
        
        //you can also insert new Data to newly created Data
        list.insertNode("Lion", "Monkey"); //insert monkey after Lion
        list.insertNode("Tiger", "Gorilla"); //insert Gorilla after Tiger
        
        //you can add and push new Data to just newly created Data
        list.insertNode("Dog", "Elephant");
        list.printList();
        
        System.out.println("\nDeleting Inserted Nodes:");
        System.out.println("------------------------");
        list.deleteNode("Lion");
        list.deleteNode("Tiger");
        list.deleteNode("Monkey");
        list.deleteNode("Gorilla");
        list.deleteNode("Elephant");
        list.printList();
 
        System.out.println("\nFinding existent and nonexistent Nodes:");
        System.out.println("---------------------------------------");
        System.out.println("Finding Node 'Dog'...");
        System.out.println("Node Found!: " + list.find("Dog"));
        System.out.println("\nFinding Node 'Cat'...");
        System.out.println("Node Found!: " + list.find("Cat"));
        System.out.println("\nFinding Node 'Zebra'...");
        System.out.println("Node Not Found!: " + list.find("Zebra"));
        System.out.println("\nFinding Node 'Elephant'...");
        System.out.println("Node Not Found! (recently deleted): " + list.find("Elephant"));     
    }   
}