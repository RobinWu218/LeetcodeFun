public class Solution {
    public int findPeakElement(int[] nums) {
       
        // use binary search
        // Invariant: A[start] < target >= A[end]
        int start = -1;
        int end = nums.length-1;
        
        while (end-start > 1){
            int mid = (end+start)/2;
            if (nums[mid]>= nums[mid+1]){
                end = mid;
            }else{
                start = mid;
            }
        }
        return end;
    }
}