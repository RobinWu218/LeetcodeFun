public class Solution {
    // use bit operations
    public double myPow(double x, int n) {
       long power = (long) n;
       if (n < 0){
           x = 1.0/x;
           power = -power;
       }
       double result = 1.0;
       while(power!=0){
           if((power&1)!=0){
               result *= x;
           }
           x *= x;
           power >>>= 1;
       }
       return result;
       
    }
}