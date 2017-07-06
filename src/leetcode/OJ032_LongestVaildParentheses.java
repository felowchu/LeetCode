package leetcode;

public class OJ032_LongestVaildParentheses {
	public static void main(String[] args){
		String s = "()()(())(";
		System.out.println(longestValidParentheses(s));
	}
	public static int longestValidParentheses(String s){
		if(s.length() <= 1)
			return 0;
		int curMax = 0;
		int[] longest = new int[s.length()];
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i) == ')' && i-longest[i-1]-1 >= 0 && s.charAt(i-longest[i-1]-1) == '('){
				longest[i] = longest[i - 1] + 2 + ((i-longest[i-1]-2>=0) ? longest[i-longest[i-1]-2] : 0);
				curMax = Math.max(longest[i], curMax);
			}
		}
		return curMax;
	}
}
