package leetcode;

public class OJ343_IntegerBreak {
	public static void main(String[] args){
		System.out.println(integerbreak(10));
	}
	public static int integerbreak(int n){
		if(n == 2) return 1;
		if(n == 3) return 2;
		int temp = 1;
		while(n > 4){
			temp *= 3;
			n -= 3;
		}
		return temp * n;
	}
}
