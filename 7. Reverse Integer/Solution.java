public class Solution {

    //easy question but pay attention to overflow problem
    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int newres = res*10 + x%10;
            if ((newres - x%10)/10 != res) return 0;
            res = newres;
            x = x/10;
        }
        return res;
    }
}