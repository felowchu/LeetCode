package leetcode;

public class OJ009_PalindromeNumber {
	public static void main(String[] args){
		int x = 12344321;
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
        boolean b = false;
        
        int x1 = 0;
        int x2 = x;
        
        while( x2 > 0){
        	x1 = x1*10+x2%10;
        	x2 = x2/10;
        }
        
        if(x1 == x){
        	b = true;
        }
        
        return b;
    }
}
