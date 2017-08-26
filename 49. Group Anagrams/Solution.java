class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,Integer> table = new HashMap<>();
        for (String s: strs){
            String sortedS = sortString(s);
            if (table.containsKey(sortedS)){
                result.get(table.get(sortedS)).add(s);
            }else{
                List<String> cur = new ArrayList<>();
                table.put(sortedS,result.size());
                cur.add(s);
                result.add(cur);
            }
        }
        return result;
    }
    
    public String sortString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}