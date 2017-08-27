class Solution {
    public String multiply(String num1, String num2) {
        char[] ar = new char[num1.length()+num2.length()];
        Arrays.fill(ar,'0');
        for (int i = num1.length()-1; i>=0; i--){
            for (int j = num2.length()-1; j>=0; j--){
                ar[i+j+1] = (char)((ar[i+j+1] - '0' + (num1.charAt(i)- '0')*(num2.charAt(j)-'0'))+'0');
                ar[i+j] = (char)((ar[i+j]-'0' + (ar[i+j+1]-'0')/10) + '0');
                ar[i+j+1] = (char)((ar[i+j+1]-'0')%10+'0');
            }
        }
        String result = new String(ar);
        int i = 0;
        while (i < result.length() && result.charAt(i)=='0'){
            i++;
        }
        if (i == result.length()){
            return "0";
        }
        return result.substring(i,result.length());
    }
}