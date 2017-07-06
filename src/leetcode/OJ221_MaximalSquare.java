package leetcode;

public class OJ221_MaximalSquare {
	public int maximalSquare(char[][] matrix){
		int row = matrix.length;
		if(row == 0)
			return 0;
		int col = matrix[0].length;
		int[] h = new int[col];
		int[] left = new int[col];
		int[] right = new int[col]; 
		int maxArea = 0;
		for(int i = 0; i < col; i++)
			right[i] = col;
		for(int i = 0; i < row; i++){
			int cur_left = 0; int cur_right = col;
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == '0')
					h[j] = 0;
				else h[j] += 1;
			}
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == '1')
					left[j] = Math.max(cur_left, left[j]);
				else{
					left[j] = 0;
					cur_left = j+1;
				}
			}
			for(int j = col - 1; j >= 0; j--){
				if(matrix[i][j] == '1')
					right[j] = Math.min(cur_right, right[j]);
				else{
					right[j] = col;
					cur_right = j;
				}
			}
			for(int j = 0; j < col; j++){
				maxArea = Math.max(Math.min(right[j] - left[j], h[j]) * Math.min(right[j] - left[j], h[j]), maxArea);
			}
		}
		return maxArea;
	}
}
