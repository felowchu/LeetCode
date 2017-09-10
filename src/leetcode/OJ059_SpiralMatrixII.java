package leetcode;

public class OJ059_SpiralMatrixII {
    public int[][] generateMatrix(int n){
        if(n <= 0) return new int[0][0];
        int[][] res = new int[n][n];
        int start = 0; int num = 1;
        while (2 * start < n){
            for(int i = start; i <= n - start - 1; i++)
                res[start][i] = num++;
            if(n - 2 * start > 1){
                for(int i = start + 1; i <= n - start - 1; i++)
                    res[i][n - start - 1] = num++;
                for(int i = n - start - 2; i>= start; i--)
                    res[n-start-1][i] = num++;
            }
            if(n - 2 * start > 2){
                for(int i = n - start - 2; i > start; i--)
                    res[i][start] = num++;
            }
            start++;
        }
        return res;
    }
}
