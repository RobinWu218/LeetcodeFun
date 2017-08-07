public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        int a = 1;
        int b = 2;
        int result = 0;
        for (int i = 3; i<n+1; i++){
            result = a+b;
            a = b;
            b = result;
        }
        return result;
    }
}