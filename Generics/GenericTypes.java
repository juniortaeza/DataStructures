/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package generics;

public class GenericTypes <F, S> //lets work with Two generic types F and S
{
    //create instances of each generic type, one for F and one for S
    protected F first;
    protected S second;
    
    //default, it can have no function OR you can call mutators and set it to null
    public GenericTypes()
    {
        //calling mutators and setting it to null; default
        setFirst(null);
        setSecond(null);
    }
    
    //working constructor
    public GenericTypes(F first, S second)
    {
        //lets keep it clean with one code path. Call mutators and set paramaters.
        setFirst(first);
        setSecond(second);
    }
    
    //accessor methods, allows us to access the field variables
    public F getFirst()
    {
        return this.first;
    }
    public S getSecond()
    {
        return this.second;
    }
    
    //mutator methods, set the field variables to the parameter
    public void setFirst(F first)
    {
        this.first = first;
    }
    public void setSecond(S second)
    {
        this.second = second;
    }
}
