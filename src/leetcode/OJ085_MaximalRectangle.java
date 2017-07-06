package leetcode;

public class OJ085_MaximalRectangle {
	public static void main(String[] args){
		char[][] matrix = {{'0','0','1','0'},{'1','1','1','1'},{'1','1','1','1'},
							{'1','1','1','0'},{'1','1','0','0'},{'1','1','1','1'},{'1','1','1','0'}};
		System.out.println(maximalRectangle(matrix));
	}
	public static int maximalRectangle(char[][] matrix){
		int row = matrix.length;
		if(row == 0)
			return 0;
		int col = matrix[0].length;
		int[] left = new int[col];
		int[] right = new int[col];
		int[] height = new int[col];
		for(int i = 0; i < col; i++)
			right[i] = col;
		int maxArea = 0;
		for(int i = 0; i < row; i++){
			int cur_left = 0;
			int cur_right = col;
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == '0')
					height[j] = 0;
				else
					height[j] += 1;
			}
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == '1'){
					left[j] = Math.max(left[j], cur_left);
				}else{
					left[j] = 0;
					cur_left = j + 1;
				}
			}
			for(int j = col - 1; j >= 0; j--){
				if(matrix[i][j] == '1')
					right[j] = Math.min(right[j], cur_right);
				else{
					right[j] = col;
					cur_right = j;
				}
			}
			for(int j = 0; j < col; j++){
				maxArea = Math.max(maxArea, (right[j] - left[j])*height[j]);
			}
		}
		return maxArea;
	}
}
