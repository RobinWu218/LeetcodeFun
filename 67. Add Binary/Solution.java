public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, curry = 0;
        while (i>=0 || j>=0 || curry>0){
            int aNum = 0, bNum = 0;
            if (i>=0){
                aNum = a.charAt(i)-'0';
                i--;
            }
            if (j>=0){
                bNum = b.charAt(j)-'0';
                j--;
            }
            sb.append((aNum+bNum+curry)%2);
            curry = (aNum+bNum+curry)/2;
            
        }
        return sb.reverse().toString();
    }
}