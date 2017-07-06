package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class OJ140_WordBreakII {
	public List<String> wordBreak(String s,List<String> wordDirct){
		return workBreak0(s, wordDirct, new HashMap<String, LinkedList<String>>());
	}
	public List<String> workBreak0(String s, List<String> wordDirct, HashMap<String , LinkedList<String>> map){
		if(map.containsKey(s))
			return map.get(s);
		LinkedList<String> list = new LinkedList<String>();
		if(s.length() == 0){
			list.add("");
			return list;
		}
		for(String str : wordDirct){
			if(s.startsWith(str)){
				List<String> subList = workBreak0(s.substring(str.length()), wordDirct, map);
				for(String word : subList){
					list.add(str + (word.isEmpty() ? "" : " ") + word); 
				}
			}
		}
		map.put(s, list);
		return list;
	}
}
