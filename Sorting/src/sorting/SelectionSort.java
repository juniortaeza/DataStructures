/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package sorting;

public class SelectionSort //Selection Sorting
{
    public void selectionSort(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n - 1; i++) //go through array
        {
            int min_idx = i; //set minimum index as i
            for(int j = i + 1; j < n; j++) //go through array
            {
                if(arr[j] < arr[min_idx]) //if number is less than minimum index
                {
                    min_idx = j; //set that as the new minimum index
                }
            }
            int temp = arr[min_idx]; //set reference to minimum index
            arr[min_idx] = arr[i]; //swap minimum index with element
            arr[i] = temp; //set new reference
        }
    }
    public void printSSArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
}
