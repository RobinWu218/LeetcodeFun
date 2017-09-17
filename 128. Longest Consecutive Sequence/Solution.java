class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int cur = 0,lo,hi;
        for (int a : nums){
            if (map.containsKey(a)){
                cur = 1;
                lo = a-1;
                hi = a+1;
                while (map.containsKey(lo)){
                    cur++;
                    if (map.get(lo)==1){
                        map.remove(lo);
                    }else{
                        map.put(lo,map.get(lo)-1);
                    }
                    lo--;
                }
                while (map.containsKey(hi)){
                    cur++;
                    if (map.get(hi)==1){
                        map.remove(hi);
                    }else{
                        map.put(hi,map.get(hi)-1);
                    }
                    hi++;
                }
                if (map.get(a)==1){
                    map.remove(a);
                }else{
                    map.put(a,map.get(a)-1);
                }
            }
            result = Math.max(result, cur);
        }
        return result;
    }
}