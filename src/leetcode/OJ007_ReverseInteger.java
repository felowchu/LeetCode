package leetcode;

public class OJ007_ReverseInteger {
	public static void main(String[] args){
		
		int x = 1534236469;
		System.out.println(reverse(x));
	}
	
	public static  int reverse(int x){
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
			return 0;
		}
		
		int a = x;
		Long b = 0L;
		
		x = Math.abs(x);
		
		System.out.println(x);
		
		while(x > 0){
			if(b*10 > Integer.MAX_VALUE){
				return 0;
			}else{
			 b = b*10 + x%10;
			 x = x/10;
			}
		}
		
		if(a > 0){     
			   a = Integer.parseInt(String.valueOf(b));
		}
		else   a = (int)-b;
		
		return a;
	}
}
