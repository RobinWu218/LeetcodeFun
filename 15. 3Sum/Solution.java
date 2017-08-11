public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if (nums[i]>0)break;
            int left = i+1, right = nums.length-1;
            int target = -nums[i];
            while (left < right){
                if (nums[left]+nums[right]==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left+1 < nums.length -1 && nums[left+1]==nums[left]) left++;
                    while (right-1 >=0 && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if (nums[left]+nums[right]<target){
                    left++;
                }else{
                    right--;
                }
            }
            while (i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return result;
    }
}