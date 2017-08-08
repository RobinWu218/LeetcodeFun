public class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> myStack = new LinkedList<>();
        int max = 0;
        int left = -1;
        for (int i = 0; i<s.length();i++){
            char curPara = s.charAt(i);
            if (curPara == '('){
                myStack.addFirst(i);
            }else{
                if (myStack.isEmpty()){
                    left = i;
                }else{
                    myStack.pop();
                    if (myStack.isEmpty()){
                        max = Math.max(max, i-left);
                    }else{
                        max = Math.max(max, i-myStack.peek());
                    }
                }
                
            }
        }
        return max;
    }
}