class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[512];
        for (int i = 0; i<s.length(); i++){
            char curs = s.charAt(i), curt = t.charAt(i);
            int spos = (int)curs, tpos = (int)curt +256;
            if (table[spos]==0 && table[tpos]==0){
                table[spos] = tpos;
                table[tpos] = spos;
            }
            if (table[spos]!=tpos || table[tpos]!=spos)return false;
            
        }
        return true;
    }
}