public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] table;
        // for row
        for (char[] row:board){
            table = new boolean[board.length+1];
            for (int i = 0; i<board.length;i++){
                char cur = row[i];
                if (cur != '.'){
                    int num = cur - '0';
                    if (table[num]){
                        return false;
                    }
                    table[num] = true;
                }
            } 
        }
        
        // for column
        for (int col = 0; col<board.length; col++){
            table = new boolean[board.length+1];
            for (int row = 0; row<board.length; row++){
                char cur = board[row][col];
                if (cur != '.'){
                    int num = cur - '0';
                    if (table[num]){
                        return false;
                    }
                    table[num] = true;
                }
            }
        }
        
        // for region
        int regionSize = (int) Math.sqrt(board.length);
        for (int a = 0; a < board.length; a+= regionSize){
            for (int b = 0; b < board.length; b+= regionSize){
                if (!checkRegion(board,a,b,regionSize)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkRegion(char[][] board,int a,int b,int regionSize){
        boolean[] table = new boolean[board.length+1];
        for (int i = 0; i<regionSize;i++){
            for (int j = 0; j<regionSize;j++){
                char cur = board[i+a][j+b];
                if (cur != '.'){
                    int num = cur - '0';
                    if (table[num]){
                        return false;
                    }
                    table[num] = true;
                }
            }
        }
        return true;
    }
}