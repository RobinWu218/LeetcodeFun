public class Solution {

    //brute force is obvious. But in this setting, only the lowest matters. Iterating from both ends yields an O(n) algo.
    public int maxArea(int[] height) {
        int low = 0, high = height.length -1, max = 0;
        while (low<high){
            max = Math.max(max,Math.min(height[low],height[high])*(high-low));
            if (height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
        
}