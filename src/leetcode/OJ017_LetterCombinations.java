package leetcode;

import java.util.LinkedList;
import java.util.List;

public class OJ017_LetterCombinations {
	public List<String> letterCombination(String digits){
		LinkedList<String> res = new LinkedList<String>();
		if(digits == null || digits.length() == 0)
			return res;
		String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		res.add("");
		for(int i = 0; i < digits.length(); i++){
			while(res.peek().length() == i){
				int x = digits.charAt(i) - '0';
				String s = res.removeFirst();
				for(char c : map[x].toCharArray())
					res.addLast(s+c);
			}
		}
		return res;
	}
}
