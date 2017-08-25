class Solution {
    public String countAndSay(int n) {
        String cur = "1";
        int count = 1;
        while (count < n){
            cur = nextStr(cur);
            count++;
        }
        return cur;
    }
    
    public String nextStr(String s){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
            count = 1;
        }
        return sb.toString();
    }
}