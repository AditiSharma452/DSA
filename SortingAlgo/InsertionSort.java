package aditi.SortingAlgo;
import java.util.*;
import java.lang.Math;
class Sorting
{
    static void printArray(int arr[],int size)
    {
        int i;
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();

            new InsertionSort().insertionSort(a,n);
            printArray(a,n);

            t--;
        }

    }
}
public class InsertionSort {
    public void insertionSort(int arr[], int n)
    {
        for (int i=0; i< n; i++){
            int j=i+1;
            int k=i;
            while (k>-1&& j<n){
                if(arr[j]<arr[k]){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    j=j-1;
                    k=k-1;
                }
                else{
                    break;
                }
            }
        }
    }
}