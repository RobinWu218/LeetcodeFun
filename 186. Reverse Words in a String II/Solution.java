public class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        int lastSpace = -1;
        for (int i = 0; i<s.length; i++){
            if (s[i] == ' '){
                reverse(s, lastSpace+1, i-1);
                lastSpace = i;
            }
        }
        reverse(s, lastSpace+1, s.length-1);
        
    }
    public void reverse(char[] s, int start, int end){
        char temp;
        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}