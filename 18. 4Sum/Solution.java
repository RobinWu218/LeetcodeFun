class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i< nums.length-3; i++){
            if (i>0 && nums[i-1]==nums[i])continue;
            if (nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target) break;
            if (nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)continue;
            for (int j = i+1; j<nums.length-2; j++){
                int newTarget = target - nums[j]-nums[i];
                if (j > i+1 && nums[j-1] == nums[j])continue;
                int left = j+1,right = nums.length-1;
                while(left<right){
                    if (nums[left]+nums[right]==newTarget){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left+1 <= nums.length-1 &&nums[left+1]==nums[left])left++;
                        while(right-1 >= 0 && nums[right-1] == nums[right])right--;
                        left++;
                        right--;
                    }else if (nums[left]+nums[right]<newTarget){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    } 
}