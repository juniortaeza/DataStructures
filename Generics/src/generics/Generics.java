/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package generics;

public class Generics //Main
{
    //lets create a few instances of GenericTypes with two differing types
    GenericTypes<Integer, Double> gt1 = new GenericTypes<>();   //Integer and Double
    GenericTypes<String, Character> gt2 = new GenericTypes<>(); //String and Character
    GenericTypes<Double, String> gt3 = new GenericTypes<>();    //Double and String

    public static void main(String[] args) 
    {
        //to access the field variables in this class, make an instance of this class
        Generics g = new Generics();
        
        System.out.println("Testing for Generic Types");
        System.out.println("*************************");
        //now we can access the field variables and call the methods in the GenericTypes class
        System.out.println("Generic Types: Integer and Double");
        System.out.println("---------------------------------");
        //gt1 deals with types Integer and Double
        g.gt1.setFirst(10); //set an integer
        g.gt1.setSecond(1.32); //set a double
        System.out.println("First generic type is: " + g.gt1.getFirst());   //call accessor methods to 
        System.out.println("Second generic type is: " + g.gt1.getSecond()); //retrieve the values
        
        System.out.println("\nGeneric Types: String and Character");
        System.out.println("---------------------------------");
        //gt2 deals with types String and Character
        g.gt2.setFirst("Dog"); //set a string
        g.gt2.setSecond('X'); //set a character
        System.out.println("First generic type is: " + g.gt2.getFirst());   //call accessor methods to 
        System.out.println("Second generic type is: " + g.gt2.getSecond()); //retrieve the values
        
        System.out.println("\nGeneric Types: Double and String");
        System.out.println("---------------------------------");
        //gt3 deals with types Double and String
        g.gt3.setFirst(5.43); //set a double
        g.gt3.setSecond("Cat"); //set a string
        System.out.println("First generic type is: " + g.gt3.getFirst());   //call accessor methods to 
        System.out.println("Second generic type is: " + g.gt3.getSecond()); //retrieve the values
    } 
}