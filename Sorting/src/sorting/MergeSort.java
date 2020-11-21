/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package sorting;

public class MergeSort //Merge Sorting
{
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1; //first half
        int n2 = r - m; //second half
        int L[] = new int[n1]; //set reference for first half
        int R[] = new int[n2]; //set reference for second half
        
        for(int i = 0; i < n1; i++) //go through first half
        {
            L[i] = arr[l + i]; //set ref for each element
        }
        for(int j = 0; j < n2; j++) //go through second half
        {
            R[j] = arr[m + 1 + j]; //set ref for each element
        }
        
        int i = 0, j = 0; //subhalf of half
        int k = l; //merged subhalf
        while(i < n1 && j < n2) //the two halves
        {
            if(L[i] <= R[j]) //while left half is less than or equal to right half
            {
                arr[k] = L[i]; //sort
                i++;
            }
            else
            {
                arr[k] = R[j]; //sort right half
                j++;
            }
            k++; //add to merged subhalf
        }    
        while(i < n1) //while index is less than first half
        {
            arr[k] = L[i]; //subhalf is sorted subarrays for left side
            i++; //merge left side
            k++; //merge subhalf
        }
        while(j < n2) //while index is less than second half
        {
            arr[k] = R[j]; //subhalf is sorted subarrays for right side
            j++; //merge right side
            k++; //merge subhalf
        }
    }
    public void mergeSort(int arr[], int l, int r)
    {
        if(l < r) //if left is less than right
        {
            int m = (l + r) / 2; //split in two
            mergeSort(arr, l, m); //merge sort - halves and subhalves
            mergeSort(arr, m + 1, r); //merge sort - halves and subhalves
            merge(arr, l, m, r); //merge altogether
        }
    }
    public void printMSArray(int arr[])
    {
        int n = arr.length; //set n as array's length
        
        for(int i = 0; i < n; i++) //go through array
        {
            System.out.println(arr[i] + " "); //print each element
        }
    }
}
