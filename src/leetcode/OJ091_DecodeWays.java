package leetcode;

public class OJ091_DecodeWays {

	public static int numDecodings(String s){
		int len = s.length();
		if(s.length() == 0)
			return 0;
		int[] num = new int[len + 1];
		num[len] = 1;
		num[len - 1] = s.charAt(len - 1) != '0' ? 1 : 0;
		for(int i = len - 2; i >= 0; i--){
			if(s.charAt(i) == '0')
				continue;
			else
				num[i] = Integer.parseInt(s.substring(i,i+2)) >= 26 ? num[i+1]+num[i+2] : num[i+2];
		}
		return num[0];
	}
}
