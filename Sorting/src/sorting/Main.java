/*
@Author: Heginio Jr Taeza
@GitHub: juniortaeza
*/
package sorting;

public class Main 
{
    public static void main(String[] args) 
    {
        BubbleSort bs = new BubbleSort(); //create instance of Bubble Sort
        InsertionSort is = new InsertionSort(); //create instance of Insertion Sort
        QuickSort qs = new QuickSort();
        SelectionSort ss = new SelectionSort();
        MergeSort ms = new MergeSort();
        
        System.out.println("--------------------------------------------------");
        System.out.println("BUBBLE SORT");
        System.out.println("--------------------------------------------------");
        int arr1[] = {64, 2, 34, 56, 16};
        
        //lets sort it using Bubble Sort
        bs.bubbleSort(arr1);
        System.out.println("Sorted Array");
        System.out.println("------------");
        bs.printBSArray(arr1);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("INSERTION SORT");
        System.out.println("--------------------------------------------------");
        int arr2[] = {90, 4, 1, 16, 34};
        
        //lets sort it using Insertion Sort
        is.insertionSort(arr2);
        System.out.println("Sorted Array");
        System.out.println("------------");
        is.printISArray(arr2);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("QUICK SORT");
        System.out.println("--------------------------------------------------");
        int arr3[] = {5, 90, 3, 34, 75};
        int n = arr3.length;
        
        //lets sort it using Quick Sort
        qs.quickSort(arr3, 0, n - 1);
        System.out.println("Sorted Array");
        System.out.println("------------");
        qs.printQSArray(arr3);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("SELECTION SORT");
        System.out.println("--------------------------------------------------");
        int arr4[] = {64, 1, 90, 91, 50};
        
        //lets sort it using Selection Sort
        ss.selectionSort(arr4);
        System.out.println("Sorted Array");
        System.out.println("------------");
        ss.printSSArray(arr4);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("MERGE SORT");
        System.out.println("--------------------------------------------------");
        int arr5[] = {4, 1, 95, 36, 37};
        
        //lets sort it using Merge Sort
        ms.mergeSort(arr5, 0, arr5.length - 1);
        System.out.println("Sorted Array");
        System.out.println("------------");
        ms.printMSArray(arr5);
    }  
}
