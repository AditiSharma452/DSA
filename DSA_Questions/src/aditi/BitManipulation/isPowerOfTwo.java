package aditi.BitManipulation;
//any decimal number when converted to binary is of the form -> 1, 10, 100, 1000, 10000...
//so to check it we sum it ie: 1+0+0+0+0= 1. if sum=1 then it is a power of 2.
public class isPowerOfTwo {
        public boolean isPowerOfTwo(int n) {
            int bin = 0;

            while(n!=0){
                bin=bin + n%2;
                n=n/2;
            }
            if(bin==1){
                return true;

            }
            else{
                return false;
            }
        }
}
