public class Solution {

    // Explanation: using DP to create 2D array. 
    // OPT(i,j) = OPT(i+1,j+1) && s(i) == s(j)
    public String longestPalindrome(String s) {

        int n = s.length();
        int[] res = new int[2];
        int max = 0;
        if (n==0) return s;
        boolean[][] table = new boolean[n][n];
        for(int i = n-1; i>=0; i--){
            for (int j = i; j<n; j++){
                table[i][j] = (s.charAt(i)==s.charAt(j)) && ((j-i<=2) || (table[i+1][j-1]));
                if ((table[i][j])&&(j-i+1 > max)) {
                    max = j-i+1;
                    res[0] = i;
                    res[1] = j+1;
                }
            }
        }
        return s.substring(res[0],res[1]);
    }
    
}