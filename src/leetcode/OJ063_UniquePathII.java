package leetcode;

public class OJ063_UniquePathII {
	public static void main(String[] args){
		int[][] obstacleGird = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGird));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid){
		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;
		int[] len = new int[col + 1];
		if(obstacleGrid[row - 1][col - 1] == 1 || obstacleGrid[0][0] == 1)
			return 0;
		len[col - 1] = 1; len[col] = 0;
		for(int i = row - 1; i >= 0; i--){
			for(int j = col - 1; j >= 0; j--){
				if(obstacleGrid[i][j] == 1)
					len[j] = 0;
				else if(j < col - 1)
					len[j] += len[j + 1];
			}
		}
		return len[0];
	}
}
