package aditi.BasicMaths;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        int t= x;
        int rev=0;
        while (t!=0){
            int rem= t%10;
            rev= rev*10+rem;
            t=t/10;
        }
        if (x>=0 && rev== x){
            return true;
        }
        else{
            return false;
        }
    }
}

// rev= 0;

// 10)121(12
//    10
//    ---
//     21
//     20
//    ----
//      1

// rem= 1
// rev= 10*0+1
// rev=1

// 10)12(1
//    10
//    --
//     2
// rev= 1*10+2
// rev= 12

// 10)1(0
//    0
//   ---
//    1

// rev=12*10+1
// rev= 121
