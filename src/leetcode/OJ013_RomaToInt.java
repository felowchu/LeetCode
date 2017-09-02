package leetcode;

public class OJ013_RomaToInt {
	public static void main(String[] args){
		String s = "MMMDLXXXVI";
		System.out.println(romanToInt(s));
	}
	public static int romanToInt(String s){
		int[] num = {1,5,10,50,100,500,1000};
		String c = "IVXLCDM";
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			char temp = s.charAt(i);
			int index = c.indexOf(temp);
			if(i < s.length() - 1 && index < c.length() - 1 && num[index] < num[c.indexOf(s.charAt(i + 1))])
				result -= num[index];
			else
				result += num[index];
		}
		return result;
	}
}
