package leetcode;

public class OJ029_DivideTwoIntegers {
    public static void main(String[] args){
        int did = Integer.MIN_VALUE, div = 1;
        System.out.println(divide(did, div));
    }
    public static int divide(int dividend, int divisor){
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        int res = 0;
        long did = Math.abs((long)dividend);
        long div = Math.abs((long)divisor);
        int signed = (dividend < 0) == (divisor < 0) ? 1 : -1;
        while (did >= div){
            long times = 1; long num = div;
            while (did >= num){
               num = num << 1;
               times = times << 1;
            }
            did -= num >> 1;
            res += times >> 1;
        }
        return signed * res;
    }
}
