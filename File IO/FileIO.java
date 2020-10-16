/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package file.io;

//import required IO tools, here we will just be using FileWriter, FileReader, and BufferedReader
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileIO 
{   
    //writing a file into the directory
    public void writeFile(String fname) //parameter allows you to name file **Refer to Line 84**
    {
        FileWriter fw = null;   //set empty
        
        try //try requires catch block
        {
            fw = new FileWriter(fname);
            
            for(int i = 0; i < 5; i++)  //will print 5 times
            {
                fw.write("This is how you read a file" + "\n");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); //exception message
        }
        finally //will handle closing
        {
            try //try requires catch block
            {
                fw.close(); //close FileWriter
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage()); //exception message
            }
        }     
    }
    
    //reading a file in the directory (reading 'writing_to_file.txt' for example)
    public void readFile()
    {
        FileReader fr = null;   //set FileReader and BufferedReader empty
        BufferedReader br = null; //BufferedReader allows you to read one line at a time
        
        try //try requires catch block
        {
            fr = new FileReader("writing_to_file.txt");
            br = new BufferedReader(fr);    //pass the file to the BufferedReader
            String line; //keeps track of each line
            
            while((line = br.readLine()) != null)   //scans text document one line at a time
            {                                       //will stop scanning once it reaches null
                System.out.println(line); //prints in console output
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()); //exception message
        }
        finally //will handle closing
        {
            try //try requires catch block
            {
                fr.close(); //close FileReader
                br.close(); //close BufferedReader
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage()); //exception message
            }
        }
    }    
    public static void main(String[] args) 
    {
        //create instance of class
        FileIO fio = new FileIO();
        
        //call method and create name for file 'writing_to_file'.txt
        fio.writeFile("writing_to_file.txt"); //check directory for the file
        
        System.out.println("Here are the contents of 'writing_to_file.txt'");
        System.out.println("----------------------------------------------");
        //call method and read certain file in directory. **Refer to Line 52**
        fio.readFile(); //check console output
    }
}