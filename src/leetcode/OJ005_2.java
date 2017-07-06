package leetcode;

public class OJ005_2 {
	public static void main(String[] args){
		String s = "cccc";
		System.out.println(longestPalindrome(s));
	}
	
	public static String longestPalindrome(String s){
		int max = 1;
		int[] n = new int[2];
		String sb = s.substring(0, 1);
		for(int i = 0; i < s.length(); i++){
			n = find(s, i);
			if(max < (n[1] - n[0]+1)){
				max = n[1] - n[0]+1;
				sb = s.substring(n[0] , n[1]+1);
			}
		}
		return sb;
	}
	
	public static int[] find(String s, int index){
		int i1 = index;
		int j1 = index;
		int i2 = index;
		int j2 = index;
		int[] n = {index, index};
		int[] n1 = {index, index};
		
		while(i1 >= 0 && j1 <= s.length()-1 && s.charAt(i1) == s.charAt(j1) ){
			   n1[0] = i1;
			   n1[1] = j1;
			   if(i1 >= 0) i1--;
			   if(j1 <= s.length()-1) j1++;
		   }
		
		if(index < s.length()-1 && s.charAt(index) == s.charAt(index + 1)){
		   j2++;
		   n[1] = j2;
		   
		 while(i2 >= 0 && j2 <= s.length()-1 && s.charAt(i2) == s.charAt(j2) ){
			   n[0] = i2;
			   n[1] = j2;
			   if(i2 >= 0) i2--;
			   if(j2 <= s.length()-1) j2++;
		   }  
		} 
        
		if(n1[0] < n[0]){
			n[0] = n1[0];
		}
		if(n1[1] > n[1]){
			n[1] = n1[1];
		}
		return n;
	} 
}
