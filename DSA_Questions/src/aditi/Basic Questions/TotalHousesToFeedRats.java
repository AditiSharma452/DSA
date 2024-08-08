package aditi.BasicQuestions;
import java.util.*;
//Problem Description :
//The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i
//
//Note:
//
//Return -1 if the array is null
//Return 0 if the total amount of food from all houses is not sufficient for all the rats.
//Computed values lie within the integer range.
//Total amount of food required for all rats = r * unit
//
//        = 7 * 2 = 14.
//
//        The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.



public class TotalHousesToFeedRats {
    public static int function(int r,int unit,int[] arr){
        int required= r*unit;
        int house=0;
        int sum=0;
        if (arr.length==0) return -1;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            house++;
            if (sum>=required){
                return house;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of rats.");
        int r = sc.nextInt();
        System.out.println("Enter unit of food each rat eats.");
        int unit =sc.nextInt();
        System.out.println("Enter the number of houses.");
        int n =sc.nextInt();
        System.out.println("Enter the unit of food in each of "+n+" houses");
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Number of houses that are enough to feed "+r +" rats is: "+function(r,unit,arr));
    }
}