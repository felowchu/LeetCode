package leetcode;

public class OJ263_UglyNumber {
    public boolean isUgly(int num){
        if(num <= 0) return false;
        if(num == 1) return true;
        while(num > 1){
            int temp = num;
            if(num % 2 == 0) num /= 2;
            if(num % 3 == 0) num /= 3;
            if(num % 5 == 0) num /= 5;
            if(num == temp) return false;
        }
        return num == 1;
    }
}
