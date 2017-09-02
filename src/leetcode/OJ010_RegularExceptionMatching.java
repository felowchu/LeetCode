package leetcode;

public class OJ010_RegularExceptionMatching {
	public class Solution {
	    public boolean isMatch(String s, String p) {
	        boolean[] match = new boolean[s.length() + 1];
	        match[s.length()] = true;
	        for(int i = p.length() - 1; i >=0; i--){
	            if(p.charAt(i) == '*'){
	                // ������Ǻţ��Ӻ���ǰƥ��
	                for(int j = s.length() - 1; j >= 0; j--){
	                    if (match[j]) continue;
	                    match[j] = match[j + 1] && (p.charAt(i - 1) == '.' || (p.charAt(i - 1) == s.charAt(j))); 
	                }
	                // �ǵð�i���һ����Ϊ�Ǻ��Ǻ���ǰ����ַ����ʹ�õ�
	                i--;
	            } else {
	                // ��������Ǻţ���ǰ����ƥ��
	                for(int j = 0; j < s.length(); j++){
	                    match[j] = match[j + 1] && (p.charAt(i) == '.' || (p.charAt(i) == s.charAt(j)));
	                }
	                // ֻҪ�Թ���pattern�����һ���ַ�����Ҫ��match[s.length()]��Ϊfalse
	                match[s.length()] = false;
	            }
	        }
	        return match[0];
	    }
	}
}
