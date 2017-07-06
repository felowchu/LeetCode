package leetcode;

public class OJ008 {
	public static void main(String[] args){
		String s = "0012a42";
		int i  = myAtoi(s);
		System.out.println(i);
	}
	
	public static int myAtoi(String str){
		String s = str.trim();
		
		if(s == "" || s == null){
			return 0;
		}
		
		String s1 = "";
		char[] c = s.toCharArray();
		Long l = 0l;

	    if(c.length > 0){
	    	
			for(int i = 1; i < c.length; i++){
				if(c[i] >= '0' && c[i] <= '9' ){
					s1 += c[i]; 
				}
			}
			
			if(s1 != "" && c[0] == '-'){
				s1 = c[0] +s1;
			}else if(c[0] >= '0' && c[0] <= '9')  s1 = c[0] + s1;
			
			
			if(s1.length() == 0){
				return 0;
			}
			
			
			if(s1.length() < 12){
				if(c[0] == '-'){
					l = -Long.valueOf(s1.substring(2, s1.length()));
				} else l = Long.valueOf(s1);
			}else if(s1.charAt(0) == '-'){
				return Integer.MIN_VALUE;
			}else return Integer.MAX_VALUE;
	    }
	   
		int n = Integer.parseInt(String.valueOf(l));
		
		return n;
	}
}
