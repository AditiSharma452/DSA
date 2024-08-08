package aditi.BitManipulation;
import java.util.*;
public class OddEvenWithBitOperation {
  public static boolean even(int n){
        if((n & 1)==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(even(n));

    }
}