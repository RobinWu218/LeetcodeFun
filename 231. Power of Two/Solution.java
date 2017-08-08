// use y = x & ~(x-1) to isolate the lowest set bit

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int y = n & (~(n-1));
        return y == n;
    }
}