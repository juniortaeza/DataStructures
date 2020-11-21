/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package sorting;

public class BubbleSort //Bubble Sorting
{
    public void bubbleSort(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n - 1; i++) //go through the array
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1]) //if current number is greater than its next number, swap
                {
                    int temp = arr[j]; //reference to current number
                    arr[j] = arr[j + 1]; //swap
                    arr[j + 1] = temp; //now work with the next number
                }
            }
        }
    }
    public void printBSArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
}
