/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package doubly.linked.lists;

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<String>();
        
        System.out.println("*************************************************");
        System.out.println("Testing for Doubly Linked Lists");
        System.out.println("*************************************************");
        System.out.println("Add to front");
        System.out.println("------------");
        list.addTF("Jim");
        list.addTF("John");
        list.printF();
        
        System.out.println("\nAdd to end");
        System.out.println("----------");
        list.addTE("James");
        list.addTE("Josh");
        list.printF();
        
        System.out.println("\nPrint backward");
        System.out.println("--------------");
        list.printB();
        
        System.out.println("\nRemoving the Head");
        System.out.println("-------------------");
        list.remove("John");
        list.printF();
        
        System.out.println("\nRemoving the Tail");
        System.out.println("-------------------");
        list.remove("Josh");
        list.printF();
    }
}
