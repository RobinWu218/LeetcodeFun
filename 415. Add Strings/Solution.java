class Solution {
    public String addStrings(String num1, String num2) {
        char[] ar = new char[num1.length() + num2.length()];
        Arrays.fill(ar, '0');
        int i = num1.length()-1, j = num2.length()-1;
        int idx = i+j+1;
        while (i>=0 || j>=0){
            if (i>=0){
                ar[idx] = (char)((ar[idx]-'0'+(num1.charAt(i) - '0'))+'0');
                i--;
            }
            if (j>=0){
                ar[idx] = (char)((ar[idx]-'0'+(num2.charAt(j) - '0'))+'0');
                j--;
            }
            ar[idx-1] = (char)((ar[idx] - '0')/10+'0');
            ar[idx] = (char)((ar[idx] - '0')%10+'0');
            idx--;
        }
        String result = new String(ar);
        int counter = 0;
        while (counter < ar.length && result.charAt(counter) == '0'){
            counter++;
        }
        if (counter == ar.length) return "0";
        return result.substring(counter, ar.length);
    }
}