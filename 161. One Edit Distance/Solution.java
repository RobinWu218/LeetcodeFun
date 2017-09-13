class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int count = 0;
        if (s.length() == t.length()){
            while (count < s.length()){
                if (s.charAt(count) != t.charAt(count)){
                    return s.substring(count+1, s.length()).equals(t.substring(count+1, t.length()));
                }
                count++;
            }
        }
        
        if (s.length() - t.length() == 1){
            while (count < t.length()){
                if (s.charAt(count) != t.charAt(count)){
                    return s.substring(count+1,s.length()).equals(t.substring(count, t.length()));
                }
                count++;
            }
            return true;
        }
        
        if (s.length() - t.length() == -1) return isOneEditDistance(t, s);
        
        return false;
    }
}