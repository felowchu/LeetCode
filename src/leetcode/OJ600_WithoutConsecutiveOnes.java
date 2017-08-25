package leetcode;

public class OJ600_WithoutConsecutiveOnes {
    public int findIntegers(int num) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num)).reverse();
        int n = sb.length();
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        dp0[0] = 1;
        dp1[0] = 1;
        for(int i = 1; i < n; i++){
            dp0[i] = dp0[i-1]+dp1[i-1];
            dp1[i] = dp0[i-1];
        }
        int result = dp0[n-1] + dp1[n-1];
        for(int i = n-2; i >= 0; i--){
            if(sb.charAt(i) == '1' && sb.charAt(i+1) == '1') break;
            if(sb.charAt(i) == '0' && sb.charAt(i+1) == '0') result -= dp1[i];
        }
        return result;
    }
}
