public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N1 = nums1.length;
        int N2 = nums2.length;
        if (N1 > N2) return findMedianSortedArrays(nums2, nums1);
        
        int i = 0, j = N1*2;
        while (i <= j){
            int mid1 = i + (j-i)/2;
            int mid2 = N1 + N2 - mid1;
            
            int l1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[(mid1-1)/2];
            int r1 = mid1 == N1*2 ? Integer.MAX_VALUE : nums1[mid1/2];
            int l2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[(mid2-1)/2];
            int r2 = mid2 == N2*2 ? Integer.MAX_VALUE : nums2[mid2/2];
            
            if (l1 > r2){
                j = mid1-1;
            }else if (l2 > r1){
                i = mid1+1;
            }else{
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
        }
        return -1.0;
        
    }
}