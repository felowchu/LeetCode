package leetcode;

public class OJ191_NumberOf1Bit {
	public int hammingWeight(int n){
		int count = 0;
		while(n != 0){
			n &= n -1;
			count++;
		}
		return count;
	}
}
