package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        if(row == 0) return list;
        int col = matrix[0].length;
        int start = 0;
        while(2 * start < row && 2 * start < col){
            for(int i = start; i <= col - start - 1; i++)
                list.add(matrix[start][i]);
            if(2 * start < row-1){
                for(int i = start + 1; i <= row - start - 1; i++){
                    list.add(matrix[i][col - start -1]);
                }
            }
            if(2 * start < col - 1 && 2 * start < row - 1){
                for(int i = col - start - 2; i >= start; i--){
                    list.add(matrix[row - start - 1][i]);
                }
            }
            if(2 * start < row - 2 && 2 * start < col - 1){
                for(int i = row - start - 2; i > start ; i--){
                    list.add(matrix[i][start]);
                }
            }
            start++;
        }
        return list;
    }
}
