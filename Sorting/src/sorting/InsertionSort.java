/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package sorting;

public class InsertionSort //Insertion Sorting
{
    public void insertionSort(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array - no need for - 1 bc we're selecting a key
        {
            int key = arr[i]; //set reference for key
            int j = i - 1; //reference for positioning
            
            while(j >= 0 && arr[j] > key) //while we don't go to null of list's left side and element is greater than key
            {
                arr[j + 1] = arr[j]; //go down the list
                j = j - 1; //until we find the position, then insert "ley"
            }
            arr[j + 1] = key; //new key
        }        
    }
    public void printISArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
}
