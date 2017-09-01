class Solution {
    public boolean isHappy(int n) {
        Set<Integer> table = new HashSet<>();
        int sum = 0;
        while (n != 1){
            if (!table.add(n))return false;
            while (n > 0){
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
            sum = 0;
        }
        return true;
    }
}