package leetcode;

public class OJ074_Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        int index1 = 0, index2 = col - 1;
        while (index1 <= row - 1 && index2 >= 0){
            if(matrix[index1][index2] > target)
                index2--;
            else if(matrix[index1][index2] < target)
                index1++;
            else
                return true;
        }
        return false;
    }
}
