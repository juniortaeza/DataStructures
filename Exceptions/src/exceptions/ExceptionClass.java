/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
 */
package exceptions;

public class ExceptionClass extends Exception //must exend Exception to work with Exceptions
{
    public ExceptionClass() //default method
    {
        this("Unknown Error");  //the error message that will be thrown
    }
    public ExceptionClass(String errorString)
    {
        super(errorString); //calls constructor/itself passing an error string
    }
}
