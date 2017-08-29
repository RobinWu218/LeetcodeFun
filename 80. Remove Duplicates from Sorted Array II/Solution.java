class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j = 0;
        boolean twice = false;
        while (j+1 < nums.length){
            if (nums[j+1]==nums[i]&&twice){
                j++;
            }else if (nums[j+1]==nums[i]&&!twice){
                twice = true;
                swap(nums, i+1,j+1);
                i++;
                j++;
            }else{
               twice = false;
                swap(nums, i+1,j+1);
                i++;
                j++;
            }
        }
        return i+1;
    }
    public void swap (int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}