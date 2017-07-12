package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class OJ472_ConcatentedWords {
	public List<String> findAllConcatentedWordsInADict(String[] words){
		List<String> list = new LinkedList<String>();
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		int n = words.length;
		if(n <= 1)
			return list;
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < n; i++){
			if(isConcatented(words[i], set)){
				list.add(words[i]);
			}
			set.add(words[i]);
		}
		return list;
	}
	
	public boolean isConcatented(String word, HashSet<String> set){
		if(set.isEmpty()) return false;
		boolean dp[] = new boolean[word.length() + 1];
		dp[0] = true;
		for(int i = 1; i <= word.length(); i++){
			for(int j = 0; j < i; j++){
				if(!dp[j]) continue;
				if(set.contains(word.substring(j,i))){
					dp[i] = true;
					break;
				}
			}
		}
		return dp[word.length()];
	}
}
