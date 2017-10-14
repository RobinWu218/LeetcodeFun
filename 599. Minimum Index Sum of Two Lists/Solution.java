class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) return findRestaurant(list2, list1);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i< list1.length; i++){
            map.put(list1[i],i);
        }
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<String>();;
        for (int i = 0; i< list2.length; i++){
            String cur = list2[i];
            if (map.containsKey(cur)){
                if (i+map.get(cur)<min){
                    min = i+map.get(cur);
                    res = new ArrayList<String>();
                    res.add(cur);
                }else if (i+map.get(cur)<min){
                    res.add(cur);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}