class Solution {
    public void sortColors(int[] nums) {
        int i = -1, j = nums.length, k= nums.length;
        while (j-i>1){
            if (nums[j-1] == 1){
                j--;
            }else if (nums[j-1] == 0){
                swap(nums,i+1,j-1);
                i++;
            }else{
                swap(nums,j-1, k-1);
                j--;
                k--;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}