package leetcode;

public class OJ639_DecodeWaysII {
    public int numDecodings(String s){
        int n = s.length();
        if(s.length() == 0) return 0;
        long[] res = new long[2];
        res[0] = decode1(s.charAt(0));
        if(s.length() == 1) return (int)res[0];
        res[1] = decode2(s.charAt(0), s.charAt(1)) + res[0]*decode1(s.charAt(1));
        for(int i = 2; i < s.length(); i++){
            long temp = res[1];
            res[1] = (res[0] * decode2(s.charAt(i-1), s.charAt(i)) + res[1] * decode1(s.charAt(i)))%1000000007;
            res[0] = temp;
        }
        return (int)res[1];
    }

    public int decode1(char c){
        if(c == '*') return 9;
        if(c == '0') return 0;
        return 1;
    }

    public int decode2(char c1, char c2){
        String str = c1 + "" + c2;
        if(c1 != '*' && c2 != '*'){
            int num = Integer.parseInt(str);
            if(num >= 10 && num <= 26){
                return 1;
            }
        }else if(c1 == '*' && c2 == '*'){
            return 15;
        }else if(c1 == '*'){
            if(c2 - '0' > 6) return 1;
            return 2;
        }else {
            if(c1 - '0' == 1) return 9;
            else if(c1 - '0' == 2) return 6;
        }
        return 0;
    }
}
