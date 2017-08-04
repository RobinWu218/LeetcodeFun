public class Solution {
    public int lengthOfLastWord(String s) {
        int start = s.length()-1;
        if (start == -1) return 0;
        while (start > 0 && s.charAt(start) == ' '){
            start--;
        }
        int length = 0;
        while(start>=0 && s.charAt(start) != ' '){
            start--;
            length++;
        }
        return length;
    }
}