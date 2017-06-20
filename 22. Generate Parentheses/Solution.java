public class Solution {

    //use backtracking 
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        bthelper(result,"",0,0,n);
        return result;
    }
    
    public void bthelper(List<String> lst, String res, int left, int right, int max){
        if (res.length()==max*2){
            lst.add(res);
            return;
        }
        if (left<max){
            bthelper(lst, res+"(", left+1,right, max);
        }
        if (right<left){
            bthelper(lst, res+")", left, right+1, max);
        }
        
    }
}