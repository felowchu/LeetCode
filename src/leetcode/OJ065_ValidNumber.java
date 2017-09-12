package leetcode;

public class OJ065_ValidNumber {
    public boolean isNumber(String s){
        int i = 0, n = s.length();
        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        boolean isNumber = false;
        while (i < n && Character.isDigit(s.charAt(i))){
            i++;
            isNumber = true;
        }
        if(i < n && s.charAt(i) == '.'){
            i++;
            while (i < n && Character.isDigit(s.charAt(i))){
                i++;
                isNumber = true;
            }
        }
        if(i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E') && isNumber){
            i++;
            isNumber = false;
            if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
            while (i < n && Character.isDigit(s.charAt(i))){
                i++;
                isNumber = true;
            }
        }
        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
        return isNumber && i == n;
    }
}
