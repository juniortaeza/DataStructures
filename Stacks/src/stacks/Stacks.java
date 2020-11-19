/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package stacks;

import java.util.Stack;

public class Stacks 
{ 
    public static void main(String[] args) 
    {
        //lets create a stack of type Integer
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("--------------------------------------------------");
        System.out.println("PUSHING ONTO A STACK");
        System.out.println("--------------------------------------------------");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("Stack: " + stack);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("POPPING OUT OF A STACK");
        System.out.println("--------------------------------------------------");
        int pop = stack.pop();
        System.out.println("Stack: " + stack);
        System.out.println("Popped Element: " + pop);
        
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("PEEKING AT A STACK");
        System.out.println("--------------------------------------------------");
        int peek = stack.peek();
        System.out.println("Stack: " + stack);
        System.out.println("Peeking at Stack: " + peek);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("SEARCHING A STACK");
        System.out.println("--------------------------------------------------");
        int position = stack.search(2);
        System.out.println("Stack: " + stack);
        System.out.println("Position of 2: " + position);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("CHECKING IF A STACK IS EMPTY");
        System.out.println("--------------------------------------------------");
        boolean empty = stack.empty();
        if(empty == true)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Stack is not empty.");
        }
             
/*
        Stack - > [   End   ]  - > you can only push, pop, or peek stuff at the end of a "Stack"
                  [         ]
                  [         ]
                  [  Front  ]               
*/         
    } 
}
