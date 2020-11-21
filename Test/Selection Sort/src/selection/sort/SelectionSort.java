/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package selection.sort;

public class SelectionSort 
{
    public static void selectionSort(int arr[])
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
    
    public static void printSSArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("\n--------------------------------------------------");
        System.out.println("SELECTION SORT");
        System.out.println("--------------------------------------------------");
        int arr[] = {64, 1, 90, 91, 50};
        
        //lets sort it using Selection Sort
        selectionSort(arr);
        System.out.println("Sorted Array");
        System.out.println("------------");
        printSSArray(arr);
    } 
}
