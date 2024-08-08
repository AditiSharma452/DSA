package aditi.BasicMaths;
import java.io.*;

//Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
//
//Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
//
//
//Examples :
//
//Input: n = 12
//Output: 2
//Explanation: 1, 2 when both divide 12 leaves remainder 0.
public class CountDigits {

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}


class Solution{
    static int evenlyDivides(int N){
        int t=N;
        int count=0;
        while(t!=0){
            int r=t%10;
            if (r!=0 && N%r==0){
                count++;
            }
            t=t/10;
        }
        return count;

    }
}