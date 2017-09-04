package leetcode;

public class OJ221_MaximalSquare2 {
    public int maximalSquare(char[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[] dp = new int[col];
        int size = 0;
        for(int i = 0; i < row; i++){
            int pre = matrix[i][0] == '0' ? 0 : 1;
            size = Math.max(size, pre);
            for(int j = 1; j < row; j++){
                int cur = matrix[i][j] == '0' ? 0 : Math.min(pre, Math.min(dp[j-1], dp[j])) + 1;
                dp[j-1] = pre;
                pre = cur;
                size = Math.max(cur, size);
            }
            dp[row-1] = pre;
        }
        return size * size;
    }
}
