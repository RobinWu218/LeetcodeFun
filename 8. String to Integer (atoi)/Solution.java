public class Solution {
    public int myAtoi(String str) {
        int sign = 1, i = 0, result = 0;
        if (str.length()==0)return 0;
        while (str.charAt(i)==' '){
            i++;
        }
        if (str.charAt(i)=='+' || str.charAt(i)=='-'){
            sign = str.charAt(i)=='+' ? 1: -1;
            i++;
        }
        while (i < str.length()){
            int digit = str.charAt(i) - '0';
            if (digit < 0 || digit > 9) break;
            
            if (Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE %10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10+digit;
            i++;
        }
        return result*sign;
    }
}