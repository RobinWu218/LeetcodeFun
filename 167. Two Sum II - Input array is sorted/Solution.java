class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {0, numbers.length-1};
        while (result[0] < result[1]){
            if (numbers[result[0]] + numbers[result[1]] == target){
                result[0]++;
                result[1]++;
                return result;
            }else if (numbers[result[0]] + numbers[result[1]] <  target){
                result[0]++;
            }else{
                result[1]--;
            }
        }
        return result;
    }
}