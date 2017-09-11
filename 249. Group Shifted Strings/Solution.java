class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        List<String> curList;
        for (String s: strings){
            String sStart = getSStart(s);
            if (!map.containsKey(sStart)){
                map.put(sStart, result.size());
                curList = new ArrayList<String>();
                curList.add(s);
                result.add(new ArrayList<String>(curList));
            }else{
                curList = result.get(map.get(sStart));
                curList.add(s);
            }
        }
        return result;
    }
    
    public String getSStart(String s){
        if (s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        int dis = s.charAt(0) - 'a';
        for (int i = 1; i< s.length(); i++){
            sb.append(leftShift(s.charAt(i), dis));
        }
        return sb.toString();
    }
    
    public char leftShift(char c, int t){
        return (char) ((c -'a'+26-t) % 26 + 'a');
    }
}