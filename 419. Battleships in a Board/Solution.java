class Solution {
    public int countBattleships(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return 0;
        int result = 0;
        for (int j = 0; j < board[0].length;j++){
            if (board[0][j] == 'X'){
                result++;
                while (j+1 < board[0].length && board[0][j+1] == 'X'){
                    j++;
                }
            }
        }
        for (int i = 1; i < board.length; i++){
            for (int j = 0; j < board[0].length;j++){
                if (board[i][j] == 'X' && board[i-1][j] != 'X'){
                    result++;
                    while (j+1 < board[0].length && board[i][j+1] == 'X'){
                        j++;
                    }
                }
            }
        }
        return result; 
    }
}