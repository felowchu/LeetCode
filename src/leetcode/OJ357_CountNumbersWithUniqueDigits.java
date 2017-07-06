package leetcode;

public class OJ357_CountNumbersWithUniqueDigits {
	public static void main(String[] args){
		System.out.println(countNumbersWithUniqueDigits(2));
	}
	public static int countNumbersWithUniqueDigits(int n){
		if(n == 0)
			return 1;
		int res = 10;
		int unique = 9;
		int begin = 9;
		while(n-- > 1 && unique > 0){
			begin *= unique--;
			res += begin;
		}
		return res;
	}
}
