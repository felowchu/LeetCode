package leetcode;

public class OJ005 {
	public static void main(String[] args){
		String s = "babcdeffedcad";
		String s1 = LongestPalindrome(s);
		boolean b = find(s, 2, 11);
		System.out.println(b);
		System.out.println(s1);
	}
	
	public static String LongestPalindrome(String s){
		int max = 0;
		String s1 = null;;
		for(int i=0; i<s.length(); i++){
			for(int j=i; j<s.length();j++){
				if(find(s, i, j)){
					if(max < j-i+1){
						max = j-i+1;
						s1 = s.substring(i, j+1);
					}
				}
			}
		}
		return s1;
	}
	
	public static boolean find(String s, int a, int b){
		boolean flag = true;
		
		while(a < b ){
			if(s.charAt(a) != s.charAt(b)){
				flag = false;
				break;
			}
			
			a++;
			if(b == a){
				continue;
			}else{
				b--;
			}
		}
		return flag;
	}
}
