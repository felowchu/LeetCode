package leetcode;

public class OJ044_2_RegexMatch {
	public static boolean isMatch(String s, String p){
		int indexP = 0,indexS = 0,dumpP = -1,dumpS = 0;
		while(indexS < s.length()){
			if(indexP < p.length() && (p.charAt(indexP) == s.charAt(indexS) || p.charAt(indexP) == '?')){
				indexP++; indexS++;
			}else if(indexP < p.length() && p.charAt(indexP) == '*'){
				dumpP = indexP; indexP++; dumpS = indexS;
			}else if(dumpP != -1){
				indexP = dumpP + 1; dumpS++; indexS = dumpS;
			}else return false;
		}
		while(indexP < p.length() && p.charAt(indexP) == '*')
			indexP++;
		return indexP == p.length();
	}
}
