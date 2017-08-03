public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        char[] table = s.toCharArray();
        int space = (numRows-1)*2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<numRows; i++){
            int curSpace = space - i*2;
            int step = i;
            while (step<s.length()){
                result.append(s.charAt(step));
                if(step+curSpace<s.length() && curSpace >0 && curSpace < space){
                    result.append(s.charAt(step+curSpace));
                }
                step+=space;
            }
        }
        return result.toString();
    }
}