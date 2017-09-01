class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // for (int i:nums){
        //     minHeap.add(i);
        //     if (minHeap.size() > k){
        //         minHeap.poll();
        //     }
        // }
        // return minHeap.peek();
        int left = 0, right = nums.length - 1, target = nums.length - k;
        while (left <= right){
            int idx = partition(nums, left, right);
            if (idx == target) return nums[idx];
            if (idx < target){
                left = idx + 1;
            }else{
                right = idx - 1;
            }
        }
        return nums[left];
    }
    
    public int partition(int[]nums, int lo, int hi){
        int i = lo-1, j = hi,k = hi, target = nums[hi];
        while (j-i>1){
            if (nums[j-1]==target){
                j--;
            }else if (nums[j-1]>target){
                swap(nums, k-1, j-1);
                k--;
                j--;
            }else{
                swap(nums, i+1, j-1);
                i++;
            }
        }
        swap(nums,hi,k);
        return j;
    }
    public void swap(int[]nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}