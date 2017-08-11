public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++){
            if (i == 0 || nums[i]!= nums[i-1]){
                int left = i+1, right = nums.length-1, sum = nums[i];
                while (left < right){
                    sum = nums[i]+nums[left]+nums[right];
                    if (sum == target){
                        return target;
                    }else if(sum<target){
                        closest = target - sum > Math.abs(closest-target)?  closest : sum;
                        left++;
                    }else{
                        closest = sum - target > Math.abs(closest-target)?  closest : sum;
                        right--;
                    }
                }
            }
        }
        return closest;
    }
}