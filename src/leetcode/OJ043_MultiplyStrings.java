package leetcode;

public class OJ043_MultiplyStrings {
    public static void main(String[] args){
        String num1 = "123";
        String num2 = "234";
        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2){
        int n = num1.length(), m = num2.length();
        if(n == 0 || m == 0 || num1.equals("0") || num2.equals("0")) return "0";
        int[] v = new int[n + m];
        for(int i = n-1; i >= 0; i--){
            int a = num1.charAt(i) - '0';
            for(int j = m-1; j >= 0; j--){
                int b = num2.charAt(j) - '0';
                int mul = a * b;
                mul += v[i+j+1];
                v[i+j+1] = mul%10;
                v[i+j] += mul/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < v.length; i++){
            if(flag || v[i] != 0) {
                sb.append(v[i]);
                flag = true;
            }
        }
        return sb.toString();
    }
}
