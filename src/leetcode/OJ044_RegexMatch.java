package leetcode;

public class OJ044_RegexMatch {
	public static void main(String[] args){
		String s = "babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab";
		String p = "***bba**a*bbba**aab**b";
		System.out.println(isMatch(s, p));
	}
	
	public static boolean isMatch(String s, String p){
		if(s.length() == 0 && p.length() == 0)
			return true;
		return matchCore(s,p,0,0);
	}
	
	public static boolean matchCore(String s, String p, int sBegin, int pBegin){
		if(sBegin == s.length() && pBegin == p.length())
			return true;
		if(sBegin != s.length() && pBegin == p.length())
			return false;
		if(pBegin < p.length()){
			if(p.charAt(pBegin) == '*'){
				if(sBegin < s.length())
					return matchCore(s, p, sBegin, pBegin+1) || matchCore(s, p, sBegin+1, pBegin) 
						|| matchCore(s, p, sBegin + 1, pBegin + 1);
				else
					return matchCore(s, p, sBegin, pBegin+1);
			}
			else if(sBegin < s.length() && (s.charAt(sBegin) == p.charAt(pBegin) || p.charAt(pBegin) == '?'))
				return matchCore(s, p, sBegin + 1, pBegin + 1);
		}
		return false;
	}
}
