class Solution {
    public int maxProduct(int[] nums) {
        // if (nums.length == 1) return nums[0];
        // int result = 0, cur = 1;
        // int negBig = Integer.MIN_VALUE;
        // for (int i = 0; i<nums.length; i++){
        //     if (nums[i]==0){
        //         while (i+1<nums.length && nums[i+1]==0){
        //             i++;
        //         }
        //         negBig = Integer.MIN_VALUE;
        //         cur = 1;
        //     }else{
        //         cur *= nums[i];
        //         if (cur>0){
        //             result = Math.max(result, cur);
        //         }else{
        //             result = Math.max(result, cur/negBig);
        //             negBig = Math.max(negBig, cur);
        //         }
        //     }
        // }
        // return result;
        
        int r = nums[0], lmax = nums[0], lmin = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]<0) swap(lmax, lmin);
            lmax = Math.max(nums[i], lmax*nums[i]);
            lmin = Math.min(nums[i], lmin*nums[i]);
            r = Math.max(lmax, r);
        }
        return r;
    }
    
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}