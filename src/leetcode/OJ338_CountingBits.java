package leetcode;

public class OJ338_CountingBits {
	public static void main(String[] args){
		int num = 100;
		int[] dp = countBits(num);
		for(int i = 0; i < dp.length; i++){
			System.out.print(dp[i] + " ");
		}
	}
	public static int[] countBits(int num){
		if(num < 0)
			return null;
		int[] dp = new int[num +1];
		for(int i = 1; i <= num; i = i * 2){
			for(int j = 0; j < i && i + j <= num; j++)
				dp[i + j] = 1 + dp[j];
		}
		return dp;
	}
}
