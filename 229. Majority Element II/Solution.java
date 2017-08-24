class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length<1)return result;
        int candidate1 = 0, count1 = 0, candidate2 = 1, count2 = 0;
        for (int t: nums){
            
            if (candidate1 == t){
                count1++;
            }else if (candidate2 == t){
                count2++;
            }else if (count1 == 0){
                candidate1 = t;
                count1 = 1;
            }else if (count2 == 0){
                candidate2 = t;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        
        if (count1 > 0 && count(nums, candidate1) / nums.length > 1.0/3.0){
            result.add(candidate1);
        }
        if (count2 > 0 && count(nums, candidate2) / nums.length > 1.0/3.0){
            result.add(candidate2);
        }
        return result;
    }
    
    public double count(int[] nums, int x){
        double count = 0.0;
        for (int t: nums){
            if (t == x){
                count++;
            }
        }
        return count;
    }
}