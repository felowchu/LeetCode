package leetcode;

public class OJ067_AddBinary {
    public static void main(String[] args){
        System.out.println(addBinary("1010","1011"));
    }
    public static String addBinary(String a, String b) {int min = Math.min(a.length(), b.length());
        int index1 = a.length()-1, index2 = b.length()-1, carry = 0;
        String res = "";
        while (index1 >= 0 && index2 >= 0){
            int temp = a.charAt(index1) + b.charAt(index2) - 2 * '0' + carry;
            if(temp <= 1) {res = (temp == 0 ? '0'+res : '1' +res); carry = 0;}
            if(temp == 2) {res = '0' + res; carry = 1;}
            if(temp == 3) {res = '1' + res; carry = 1;}
            index1--; index2--;
        }
        if(index1 >= 0){
            while (index1 >= 0){
                if(a.charAt(index1) == '1' && carry == 1){
                    res = '0' + res;
                    carry = 1;
                }else{
                    res = a.charAt(index1) - '0' + carry + res;
                    carry = 0;
                }
                index1--;
            }
        }
        if(index2 >= 0){
            while (index2 >= 0){
                if(b.charAt(index2) == '1' && carry == 1){
                    res = '0' + res;
                    carry = 1;
                }else{
                    res = b.charAt(index2) - '0' + carry + res;
                    carry = 0;
                }
                index2--;
            }
        }
        if(carry == 1) res = '1' + res;
        return res;
    }
}
