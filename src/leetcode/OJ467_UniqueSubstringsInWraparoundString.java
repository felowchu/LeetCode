package leetcode;

public class OJ467_UniqueSubstringsInWraparoundString {
	public static void main(String[] args){
		System.out.println(findSubstringInWraproundString("zabcdf"));
	}
	public static int findSubstringInWraproundString(String p){
		char[] pc = p.toCharArray();
		int n = p.length();
		int len = 0, sum = 0;
		if(n <= 1) return n;
		int[] num = new int[26];
		for(int i = 0; i < n; i++){
			if(i > 0 && (pc[i] - pc[i - 1] == 1 || (pc[i] == 'a' && pc[i-1] == 'z'))){
				len++;
			}else
				len = 1;
			int index = pc[i] - 'a';
			num[index] = Math.max(num[index], len);
		}
		for(int i = 0; i < 26; i++)
			sum += num[i];
		return sum;
	}
}
