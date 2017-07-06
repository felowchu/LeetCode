package leetcode;

public class OJ174_DungeonGame {
	public static void main(String[] args){
		int[][] dungeon = {{0,-3}};
		System.out.println(calculateMinimumHP(dungeon));
	}
	public static int calculateMinimumHP(int[][] dungeon){
		if(dungeon.length == 0)
			return 0;
		int row = dungeon.length;
		int col = dungeon[0].length;
		int[] dp = new int[col + 1];
		dp[col] = Integer.MAX_VALUE;
		dp[col - 1] = (dungeon[row - 1][col - 1] >= 0 ? 1 : (-dungeon[row - 1][col - 1] + 1));
		for(int j = col - 2; j >= 0; j--){
			dp[j] = dungeon[row -1][j] >= dp[j + 1] ? 1 : (dp[j + 1] - dungeon[row -1][j]);
		}
		for(int i = row - 2; i >= 0; i--){
			for(int j = col - 1; j >= 0; j--){
				if(dungeon[i][j] >= Math.min(dp[j],dp[j+1]))
					dp[j] = 1;
				else
					dp[j] = Math.min(dp[j], dp[j + 1]) - dungeon[i][j];
			}
		}
		return dp[0];
	}
}
