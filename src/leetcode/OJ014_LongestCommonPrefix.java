package leetcode;

public class OJ014_LongestCommonPrefix {
	public static void main(String[] args){
		String[] strs = {"aa","a"};
		System.out.println(longestPrefix(strs));
	}
	
	public static String longestPrefix(String[] strs){
		if(strs == null || strs.length == 0)
			return "";
		String result = strs[0];
		int longest = strs[0].length();
		for(int i = 0; i < strs.length; i++){
			int index = -1;
			int len = Math.min(result.length(), strs[i].length());
			for(int j = 0; j < len; j++){
				if(result.charAt(j) == strs[i].charAt(j))
					index++;
				else
					break;
			}
			if(index + 1 < longest)
				longest = index + 1;
			if(longest == -1)
				return "";
			result = result.substring(0, longest);
		}
		return result;
	}
}
