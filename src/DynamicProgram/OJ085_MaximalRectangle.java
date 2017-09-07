package DynamicProgram;

import java.util.Arrays;

public class OJ085_MaximalRectangle {
    public int maximalRectangle(char[][] matrix){
        int m = matrix.length;
        if(m == 0) return 0;
        int n = matrix[0].length;
        int[] height = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        int maxArea = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1') height[j]++;
                else height[j] = 0;
            }
            int curLeft = 0;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1')
                    left[j] = Math.max(curLeft, left[j]);
                else {
                    curLeft = j + 1;
                    left[j] = 0;
                }
            }
            int curRight = n;
            for(int j = n-1; j >= 0; j--){
                if(matrix[i][j] == '1')
                    right[j] = Math.min(curRight, right[j]);
                else {
                    curRight = j;
                    right[j] = n;
                }
            }
            for(int j = 0; j < n; j++){
                maxArea = Math.max(maxArea, height[j] * (right[j] - left[j]));
            }
        }
        return maxArea;
    }
}
