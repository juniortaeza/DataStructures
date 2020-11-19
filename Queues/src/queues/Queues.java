/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package queues;

import java.util.Queue;
import java.util.LinkedList;

public class Queues 
{
    public static void main(String[] args) 
    {
        //lets work with queues in a linked list
        Queue<Integer> queue = new LinkedList<>();
        
        System.out.println("--------------------------------------------------");
        System.out.println("QUEUE ONTO A LINKED LIST");
        System.out.println("--------------------------------------------------");
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        
        System.out.println("Queue: " + queue);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("DEQUEUE FROM A LINKED LIST");
        System.out.println("--------------------------------------------------");
        int dequeue = queue.remove();
        System.out.println("Queue: " + queue);
        System.out.println("Dequeued Element: " + dequeue);
         
        System.out.println("\n--------------------------------------------------");
        System.out.println("PEEKING AT A QUEUE FROM A LINKED LIST");
        System.out.println("--------------------------------------------------");
        int peek = queue.peek();
        System.out.println("Queue: " + queue);
        System.out.println("Peeking at Queue: " + peek);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("CHECK TO SEE SIZE OF THE QUEUE");
        System.out.println("--------------------------------------------------");
        int size = queue.size();
        System.out.println("Queue: " + queue);
        System.out.println("Size: " + size);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("CHECKING IF A QUEUE IS EMPTY");
        System.out.println("--------------------------------------------------");
        boolean empty = queue.isEmpty();
        if(empty == true)
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Queue is not empty.");
        }
             
/*
                  [   End   ]  
                  [         ]
                  [         ]
        Queue - > [  Front  ] - > you can only queue, dequeue, or peek from a "queue"         
*/         
    }   
}
