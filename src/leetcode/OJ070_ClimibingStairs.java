package leetcode;

public class OJ070_ClimibingStairs {
	public static void main(String[] args){
		System.out.println(climbStairs(5));
	}
	public static int climbStairs(int n){
		if(n <= 0)
			return 0;
		int before = 1;
		int after = 1;
		while(n-- > 0){
			after = after + before;
			before = after - before;
		}
		return before;
	}
}
