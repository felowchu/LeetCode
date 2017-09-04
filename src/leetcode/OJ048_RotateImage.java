package leetcode;

public class OJ048_RotateImage {
    public void rotate(int[][] matrix){
        int s = 0;
        int n = matrix.length;
        while(s * 2 < n){
            for(int i = s; i < n-s-1; i++){
                int temp = matrix[s][i];
                matrix[s][i] = matrix[n-i-1][s];
                matrix[n-i-1][s] = matrix[n-s-1][n-i-1];
                matrix[n-s-1][n-i-1] = matrix[i][n-s-1];
                matrix[i][n-s-1] = temp;
            }
            s++;
        }
    }
}
