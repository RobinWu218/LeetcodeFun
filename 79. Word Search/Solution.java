class Solution {
    public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return true;
        if (board.length == 0 || board[0].length == 0)return false;
        for (int i = 0; i<board.length; i++){
            for (int j = 0; j <board[0].length; j++){
                if (board[i][j] == word.charAt(0) && helper(board, i, j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean helper(char[][] board, int i, int j, int offset, String s){
        if (offset == s.length()) return true;
        if (i<0 || i >= board.length || j <0 || j >=board[0].length) return false;
        if (board[i][j] != s.charAt(offset))return false;
        board[i][j] ^=256;
        if (helper(board,i+1,j,offset+1,s) ||helper(board,i-1,j,offset+1,s) || helper(board,i,j+1,offset+1,s)||
           helper(board,i,j-1,offset+1,s))return true;
        board[i][j] ^=256;
        return false;
    }
}