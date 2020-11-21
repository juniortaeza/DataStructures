/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package quick.sort;

public class QuickSort 
{
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; //set reference for pivot
        int i = (low - 1); //set reference for (lower than pivot)
        
        for(int j = low; j < high; j++) //go through array as j is lower than high
        {
            if(arr[j] < pivot) //if number in array is less than pivot
            {
                i++; //go through the array
                int temp = arr[i]; //set reference for selected number
                arr[i] = arr[j]; //swap
                arr[j] = temp; //set new reference 
            }
        }
        int temp = arr[i + 1]; //reference for next item in array
        arr[i + 1] = arr[high]; //swap so next item is new high
        arr[high] = temp; //set new pivot
        return i + 1; //return 
    }
    public static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high); //if low is less than high, quick sort
            quickSort(arr, low, pi - 1); //swap
            quickSort(arr, pi + 1, high); //swap 
        }
    }
    public static void printQSArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("--------------------------------------------------");
        System.out.println("QUICK SORT");
        System.out.println("--------------------------------------------------");
        int arr[] = {5, 90, 3, 34, 75};
        int n = arr.length;
        
        //lets sort it using Quick Sort
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array");
        System.out.println("------------");
        printQSArray(arr);
    } 
}
