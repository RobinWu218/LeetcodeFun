class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        if ((numerator < 0 && denominator > 0) ||(numerator > 0 && denominator < 0)){
            sb.append("-");
        }
        
        long numer = Math.abs((long)numerator);
        long denom = Math.abs((long)denominator);
        
        sb.append(numer/denom);
        numer%=denom;
        if (numer == 0) return sb.toString();
        
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();
        map.put(numer, sb.length());
        while (numer != 0){
            numer *= 10;
            long num = numer/denom;
            long leftoff = numer%denom;
            sb.append(num);
            if (!map.containsKey(leftoff)){
                map.put(leftoff,sb.length());
            }else{
                int pos = map.get(leftoff);
                sb.insert(pos,"(");
                sb.append(")");
                break;
            }
            numer = leftoff;
        }
        return sb.toString();
    }
}