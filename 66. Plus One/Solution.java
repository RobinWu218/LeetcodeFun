public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        digits[n] += 1;
        for(int i = n; i>0; i--){
            if (digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if (digits[0]==10){
            int[] newDigits = new int[n+2];
            newDigits[0]=1;
            newDigits[1]=0;
            for (int j = 2; j<=n+1;j++){
                newDigits[j]=digits[j-1];
            }
            digits = newDigits;
        }
        return digits;
    }
}