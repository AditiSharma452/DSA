package aditi.SortingAlgo;
import java.util.*;
import java.io.*;
public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        for (int i=n-1; i>=0;i--){
            for (int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return;
    }
}

class Sorting
{
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            new BubbleSort().bubbleSort(arr,n);
            printArray(arr);
    }
}
