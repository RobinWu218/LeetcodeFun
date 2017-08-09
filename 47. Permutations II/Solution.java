public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> table = new HashMap<>();
        for (int i : nums){
            if (table.containsKey(i)){
                table.put(i, table.get(i)+1);
            }else{
                table.put(i,1);
            }
        }
        backtracking(nums.length, new ArrayList<Integer>(), table, result);
        return result;
    }
    
    public void backtracking(int remaining, List<Integer> cur, Map<Integer,Integer>table, List<List<Integer>> result){
        if (remaining == 0){
            result.add(new ArrayList<>(cur));
        }else{
            for (Integer key : table.keySet()){
                int count = table.get(key);
                if (count > 0){
                    cur.add(key);
                    table.put(key, count-1);
                    backtracking(remaining-1, cur, table, result);
                    cur.remove(cur.size()-1);
                    table.put(key,count);
                }
            }
        }
    }
}