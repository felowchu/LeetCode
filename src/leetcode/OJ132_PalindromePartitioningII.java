package leetcode;

public class OJ132_PalindromePartitioningII {
	public static void main(String[] args){
		System.out.println(minCut("ltsqjodzeriqdtyewsrpfscozbyrpidadvsmlylqrviuqiynbscgmhulkvdzdicgdwvquigoepiwxjlydogpxdahyfhdnljshgjeprsvgctgnfgqtnfsqizonirdtcvblehcwbzedsmrxtjsipkyxk"));
	}
	
	public static int minCut(String s){
		return search(s, 0, s.length() - 1);
	}
	
	public static int search(String s, int start , int end){
		int count = 0;
		if(start == s.length())
			return 0;
		while(end >= start && s.charAt(start) != s.charAt(start))
			end--;
		if(end < start) return 0;
		else{
			int index1 = end;
			int index2 = start;
			while(end >= index2 && s.charAt(start) == s.charAt(end)){
				start++;
				end--;
			}
			if(end >= index2){
				count = search(s, index2, index1-1);
			}else{
				start++;
				count = 1 + search(s, start, s.length() - 1);
			}
		}
		return count;
	}
}
