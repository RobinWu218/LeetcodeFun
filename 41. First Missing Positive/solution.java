public class Solution {
    public int firstMissingPositive(int[] nums) {
        int end = partition(nums)+1;
        int result = end;
        for (int i = 0; i < end; i++){
            int cur = Math.abs(nums[i]);
            if (cur<=end){
                nums[cur-1] = nums[cur-1]<0? nums[cur-1] : -nums[cur-1];
            }
        }
        
        for (int i = 0; i<end; i++){
            if (nums[i]>0){
                result = i;
                break;
            }
        }
        return result+1;
    }
    
    public int partition(int[] nums){
        int left = -1;
        int right = nums.length -1;
        while (left < right){
            if (nums[right]<=0){
                right--;
            }else{
                int temp = nums[right];
                nums[right] = nums[left+1];
                nums[left+1] = temp;
                left++;
            }
        }
        return left;
    }
}