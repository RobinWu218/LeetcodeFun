class Solution {
    public int compareVersion(String version1, String version2) {
        int count1 = 0, count2 = 0;
        int i = 0, j = 0;
        while (i < version1.length() || j < version2.length()){
            while (i < version1.length() && version1.charAt(i)!='.'){
                count1 = count1*10 + version1.charAt(i)-'0';
                i++;
            }
            i++;
            while (j < version2.length() && version2.charAt(j)!='.'){
                count2 = count2*10 + version2.charAt(j)-'0';
                j++;
            }
            j++;
            if (count1 > count2){
                return 1;
            }
            if (count1 < count2){
                return -1;
            }
            count1 = 0;
            count2 = 0;
        }
        return 0;
    }
}