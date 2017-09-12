package leetcode;

public class OJ066_PlusOne {
    public int[] plusOne(int[] digits){
        int n = digits.length;
        if(n == 0) return digits;
         digits[n-1] += 1;
         int carry = 0, index = n-2;
         if(digits[n-1] > 10){
             carry = 1;
             digits[n-1] -= 10;
         }
         while (index >= 0 && carry == 1){
             digits[index] += carry;
             carry = 0;
             if(digits[index] == 10){
                 digits[index] -= 10;
                 carry = 1;
                 index--;
             }else break;
         }
         if(carry == 1) {
            int[] res = new int[n+1];
            res[0] = 1;
            for(int i = 0; i < n; i++){
                res[i+1] = digits[i];
            }
            return  res;
         }
         return digits;
    }
}
