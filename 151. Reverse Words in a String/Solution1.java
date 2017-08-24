public class Solution {
    public String reverseWords(String s) {
        String tS = trim(s);
        if (tS.length()<=1) return tS;
        char[] ar = tS.toCharArray();
        StringBuilder sb = new StringBuilder();
        reverse(ar,0,ar.length);
        int start = 0;
        for (int i = 1; i < ar.length; i++){
            if (ar[i] == ' '){
                reverse(ar, start, i);
                sb.append(new String(Arrays.copyOfRange(ar,start,i)));
                sb.append(' ');
                while(i<ar.length && ar[i]==' '){
                    i++;
                }
                start = i;
            }
        }
        
        reverse(ar, start, ar.length);
        sb.append(new String(Arrays.copyOfRange(ar,start,ar.length)));
        
        return sb.toString();
        
    }
    
    public void reverse(char[] ar, int start, int end){
        if (start >= end) return;
        while (end-start > 1){
            char temp = ar[start];
            ar[start] = ar[end-1];
            ar[end-1] = temp;
            start++;
            end--;
        }
    }
    
    public String trim(String s){
        int start = 0, end = s.length()-1;
        while(start < s.length() && s.charAt(start)==' '){
            start++;
        }
        while (end >=0 && s.charAt(end) == ' '){
            end--;
        }
        if (start > end) return "";
        return s.substring(start,end+1);
    }
}