package aditi.BitManipulation;
import java.util.Scanner;

//Problem Description :
//The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:
//int OperationsBinaryString(char* str);
//The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:
//        – A denotes AND operation
//– B denotes OR operation
//– C denotes XOR Operation
//You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.
//
//Note:
//
//No order of priorities of operations is required
//Length of str is odd
//If str is NULL or None (in case of Python), return -1
public class BitOperationOnChar {
    public static int opp(String str) {
        if (str == null) {
            return -1;
        }
        int out = str.charAt(0);
        out=out-'0';
        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'A') {
                int a= str.charAt(i + 1)-'0';
                System.out.println("i: "+out);
                System.out.println("i+1: "+a);
                out =  (out & a);//ASCII integer Of 0=48 and 1=49.
                                                                // 48 and 49 are converted into binary
                                                                //and after operation result is stored in out in integer form
                System.out.println("A: "+out);
                System.out.println("---------------");
            }
            if (str.charAt(i) == 'B') {
                System.out.println("i: "+out);
                int b= str.charAt(i + 1)-'0';
                System.out.println("i+1: "+b);
                out = (out | b);
                System.out.println("B: "+out);
                System.out.println("---------------");
            }
            if (str.charAt(i) == 'C') {
                System.out.println("i: "+out);
                int c= str.charAt(i + 1)-'0';
                System.out.println("i+1: "+c);
                out =  (out ^ c);
                System.out.println("C: "+ out);
                System.out.println("---------------");
            }
        }
        int resu = out ;//ASCII integer value 49 - 48(ASCII int value of '0')
        return resu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Final Result: "+ opp(str));
    }
}