/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package recursion;

public class Recursion 
{
    //Using Recursion to sum the characters of a string - Deals with ASCII values
    public static int sumString(String str) //you don't have to create instance of a class with static methods
    {                                       //...resides in this Recursion class
        if(str.length() == 0)  //if string is empty
        {
            return 0;          //return 0
        }
        else
        {
            /*
            Now, we must begin dissecting each character of the string.
            
            str.charAt(0) just allows the recursion logic to keep occurring at the beginning
            
            sumString(str.substring(1)); is where Recursion happens - calling method within its method - what makes function keep repeating until it reaches null
            
            ^ it will keep dissecting, summing, dissecting, summing, dissecting, summing
              until it reaches null
            */
            return str.charAt(0) + sumString(str.substring(1));
            
            /*
            For example, here is an example string:
            "Example"
            
            First,
            If the string is not empty, execute recursion logic.
            
            Clearly, 
            The string is not empty and is set to "Example." Thus, it will execute recursion logic
            
            So now,
            "Example"
            
            str.charAt(0) indicates we begin with 'E'
            sumString(str.substring(1)) takes the ASCII value of 'E' and adds it to the stored value (0); then it gets rid of it
            
            So now, we have
            "xample"
            
            str.charAt(0) indicates we begin with 'x'
            sumString(str.substring(1)) takes the ASCII value of 'x' and adds it to the stored value ('E'); then it gets rid of it
            
            So now, we have
            "ample"
            
            str.charAt(0) indicates we begin with 'a'
            sumString(str.substring(1)) takes the ASCII value of 'a' and adds it to the stored values ('Ex'); then it gets rid of it
            
            To conclude,
            This process will continue until the string is empty, or when it reaches null            
            */
        }
    }          
    public static void main(String[] args) 
    {
        //You do not need to make an instance because it is a static method and resides only
        //in this class
        
        //Lets test the Recursion method
        System.out.println("Testing for summing a string");
        System.out.println("*******************************");
        System.out.println("Lets first test an empty string");
        System.out.println("-------------------------------");
        String empty = "";  //empty string
        System.out.println("The sum of string 'empty' is: " + sumString(empty)); //sum of an empty string
        
        System.out.println("\nNow lets test with a string");
        System.out.println("---------------------------");
        String test = "test"; //string holding "test"
        System.out.println("The sum of string 'test' is: " + sumString(test)); //sum of "test"
        
        System.out.println("\nLets check if this is right");
        System.out.println("---------------------------");
        System.out.println("The ASCII value of 't' is: " + sumString("t")); //break down each ASCII value
        System.out.println("The ASCII value of 'e' is: " + sumString("e")); //break down each ASCII value
        System.out.println("The ASCII value of 's' is: " + sumString("s")); //break down each ASCII value
        System.out.println("The ASCII value of 't' is: " + sumString("t")); //break down each ASCII value
        
        int sum = sumString("t") + sumString("e") + sumString("s") + sumString("t"); //sum those ASCII values
        System.out.println("\nSumming those numbers is: " + sum);    
    } 
}