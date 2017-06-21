public class Solution {

    // I used dp originally but failed memory limit. The better way is to use a presum+hashmap.
    // Note that if a0+a1+...ai = a0+a1+...+aj then a(i+1) + a(i+2) + ... +aj is 0.
    public int findMaxLength(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<nums.length; i++){
            if (nums[i] == 0) nums[i] = -1;
        }
        map.put(0, -1);
        int runningsum = 0;

        for (int j = 0; j<nums.length; j++){
            runningsum += nums[j];
            
            if (map.containsKey(runningsum)){
                max = Math.max(max, j - map.get(runningsum));
            }else{
                map.put(runningsum, j);
            }
        }
        return max;
    }
}