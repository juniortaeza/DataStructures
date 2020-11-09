/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package exceptions;

import java.io.*;

public class Exceptions //Main
{
    //**Refer to readFile() method from FileIO.java code**
    public void readFile() throws ExceptionClass //must throw ExceptionClass to methods that could
    {                                            //possibly have an error
        FileReader fr = null;  
        BufferedReader br = null; 
        
        try 
        {
            fr = new FileReader("nonexistent_file.txt"); //FileReader will not be able to read
            br = new BufferedReader(fr);                 //a file that doesn't exist in the directory
            String line;                                 //so it will throw an error message using
                                                         //exception
            while((line = br.readLine()) != null)   
            {                                       
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            //You can now replace this exception message below with a custom error message
            //System.out.println(e.getMessage()); //exception message
            
            //New custom error message
            throw new ExceptionClass("Error!");
        }
        finally 
        {
            try             
            {
                fr.close(); 
                br.close(); 
            }
            catch(Exception e)
            {
                //You can now replace this message below 
                //System.out.println(e.getMessage());
                
                //New custom error message
                throw new ExceptionClass("Error!");
            }
        }
    }    
    public static void main(String[] args) 
    {
        //Make instances of this class
        Exceptions ex = new Exceptions();
        
        //exceptions deals with try-catch blocks. You must use try-catch!
        try //lets try reading a file that does not exist in the directory
        {
            ex.readFile();  
        }
        catch(ExceptionClass ec)
        {
            System.out.println(ec.getMessage()); //check console output for exception error message!
        }
    }
}
