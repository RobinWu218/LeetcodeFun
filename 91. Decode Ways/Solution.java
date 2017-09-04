class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return s.charAt(0) == '0' ? 0 : 1; 
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) -'0' == 0 ? 0 : 1;
        dp[1] = dp[0] == 0 ? 0 : s.charAt(1) -'0' == 0 ? 0 : 1;
        int cur = (s.charAt(0) -'0')*10 +  s.charAt(1) -'0';
        if (cur >= 10 && cur <= 26){
            dp[1] += dp[0];
        }
        int first = 0;
        for (int i = 2; i< s.length(); i++){
            first = s.charAt(i)-'0';
            cur = (s.charAt(i-1) -'0')*10 + first;
            if (first != 0){
                dp[i] += dp[i-1];
            }
            
            if (cur >= 10 && cur <=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()-1];
    }
}