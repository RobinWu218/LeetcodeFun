public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length()<needle.length()) {return -1;}
        
        final int BASE = 26;
        int hayHash = 0, nHash = 0, powerS = 1;
        for (int i = 0; i< needle.length(); i++){
            hayHash = hayHash * BASE + haystack.charAt(i);
            nHash = nHash * BASE + needle.charAt(i);
            powerS = i > 0 ? powerS * BASE : 1;
        }
        
        for (int i = needle.length(); i< haystack.length(); i++){
            if (hayHash == nHash && haystack.substring(i-needle.length(), i).equals(needle)){
                return i-needle.length();
            }
            hayHash -= haystack.charAt(i-needle.length())*powerS;
            hayHash = hayHash * BASE + haystack.charAt(i);
        }
        if (hayHash == nHash && haystack.substring(haystack.length()-needle.length()).equals(needle)){
            return haystack.length()-needle.length();
        }
        return -1;
    }
}