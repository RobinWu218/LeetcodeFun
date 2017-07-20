public class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num;
        while (left <= right){
            long mid = left + (right-left)/2;
            long squared = mid * mid;
            if (squared < num){
                left = mid + 1;
            }else if (squared > num){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}