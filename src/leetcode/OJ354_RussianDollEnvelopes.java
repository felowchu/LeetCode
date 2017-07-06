package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class OJ354_RussianDollEnvelopes {
	public int maxEnvelops(int[][] envelops){
		int row = envelops.length;
		if(row == 0)
			return 0;
		Arrays.sort(envelops, new Comparator<int[]>() {
			public int compare(int[] num1, int[] num2){
				if(num1[0] == num2[0])
					return num2[1] - num1[1];
				else
					return num1[0] - num2[0];
			}
		});
		
		int[] dp = new int[row];
		int len = 0;
		for(int i = 0; i < row; i++){
			int j = Arrays.binarySearch(dp, 0, len, envelops[i][1]);
			if(j < 0) j = -(j + 1);
			dp[j] = envelops[i][1];
			if(j == len) len++;
		}
		return len;
	}
}
