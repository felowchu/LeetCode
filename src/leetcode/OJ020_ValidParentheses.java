package leetcode;

import java.util.Stack;

public class OJ020_ValidParentheses {
    public boolean isValid(String s){
        if(s.length() == 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        char[] c = s.toCharArray();
        int i = 1;
        stack.add(c[0]);
        while(i < s.length()){
            if(c[i] == '{' || c[i] == '[' || c[i] == '(')
                stack.push(c[i]);
            else if(c[i] == '}'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '{') stack.pop();
            }else if(c[i] == ']'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '[') stack.pop();
                else return false;
            }else if(c[i] == ')'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') stack.pop();
                else return false;
            }else{
                return false;
            }
            i++;
        }
        return stack.isEmpty();
    }
}
