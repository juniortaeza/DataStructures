/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package trees;

public class Main 
{
    public static void main(String[] args) 
    {
        //lets create a Binary Tree of type Integer
        BinaryTree<Integer> bt = new BinaryTree<>();
        
        System.out.println("----------------------------------------------------");
        System.out.println("TESTING FOR BINARY SEARCH TREE");
        System.out.println("----------------------------------------------------");
        System.out.println("Initial Tree");
        System.out.println("------------");
        bt.insert(10); //this will be the Root
        bt.insert(20);
        bt.insert(9);
        bt.insert(6);
        bt.insert(3);
        bt.insert(15);
        bt.insert(25);
        bt.printTree();
        
        System.out.println("\nLevel Order Traversal");
        System.out.println("---------------------"); 
        bt.printLevelOrder();
        
        System.out.println("\nRemoving '9'");
        System.out.println("-------------------");
        bt.remove(9);
        bt.printTree();
        System.out.println("");
        bt.printLevelOrder();   
    }  
}
