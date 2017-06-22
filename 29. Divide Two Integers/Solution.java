public class Solution {
    public static int divide(int dividend, int divisor) {
        long result = 0;
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == dividend){
            return 1;
        }
        
        long x = Math.abs(((long)dividend));
        long y = Math.abs(((long)divisor));
        
        int power = 32;
        long yPower = y << power;

        while (x >= y){
            while (yPower > x){
                yPower >>>= 1;
                power--;
            }
            result += 1L << power;
            x -= yPower;
        }
        int res = (int)result;
        if ((dividend > 0)&&(divisor > 0)&&(res < 0)){
            return Integer.MAX_VALUE;
        }
        if ((dividend < 0)&&(divisor < 0)&&(res < 0)){
            return Integer.MAX_VALUE;
        }
        if (((dividend > 0)&&(divisor < 0))||((dividend < 0)&&(divisor > 0))){
            return (-res);
        }
        return res;
        
    }

    public static void main(String[] args) {
      System.out.println(divide(-2147483648, -2147483647)); 
  }
}