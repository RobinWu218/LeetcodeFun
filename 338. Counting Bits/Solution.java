public class Solution {
    private static final double L0G_2 = Math.log (2);

    public int[] countBits(int num) {
        int[] result = new int[num+1];
        result[0] = 0;
        for (int i = 1; i<=num; i++){
            int lowSetBit = i & (~(i-1));
            if (lowSetBit == 1){
                result[i] = result[i-1]+1;
            }else{
                result[i] = result[i-1] - ((int) (Math.log(lowSetBit)/L0G_2)) + 1;
            }
        }
        return result;
    }
}