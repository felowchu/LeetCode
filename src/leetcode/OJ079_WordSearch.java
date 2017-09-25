package leetcode;

public class OJ079_WordSearch {
    private int len = 0;
    public boolean exist(char[][] board, String word){
        int rows = board.length;
        if(rows == 0) return false;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        boolean res = false;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(board[row][col] == word.charAt(0)){
                    res = backTrace(board, word, row, col, visited);
                    if(res) break;
                }
            }
        }
        return res;
    }

    private boolean backTrace(char[][] board, String word, int row, int col, boolean[][] visited){
        if(len == word.length()) return true;
        int rows = board.length;
        int cols = board[0].length;
        boolean res = false;
        if(row >= 0 && row < rows && col >= 0 && col < cols && board[row][col] == word.charAt(len) && !visited[row][col]){
            len++;
            visited[row][col] = true;
            res = backTrace(board, word, row+1, col, visited)
                        || backTrace(board, word, row-1, col, visited)
                        || backTrace(board, word, row, col+1, visited)
                        || backTrace(board, word, row, col-1, visited);

            if(!res){
                visited[row][col] = false;
                len--;
            }
        }
        return res;
    }
}
