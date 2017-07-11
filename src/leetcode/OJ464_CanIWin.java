package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class OJ464_CanIWin {
	public boolean canIWin(int maxChoosableInteger, int desiredTotal){
		if(desiredTotal <= 0) return true;
		if(maxChoosableInteger * (maxChoosableInteger + 1)/2 < desiredTotal) return false;
		return canIWin0(desiredTotal, new int[maxChoosableInteger], new HashMap<String, Boolean>());
	}
	
	public boolean canIWin0(int total, int[] states, HashMap<String, Boolean> map){
		String state = Arrays.toString(states);
		if(map.containsKey(state))
			return map.get(state);
		for(int i = 0; i < states.length; i++){
			if(states[i] == 0){
				states[i] = 1;
				if(total <= i + 1 || !canIWin0(total - i - 1, states, map)){
					map.put(state, true);
					states[i] = 0;
					return true;
				}
				states[i] = 0;
			}
		}
		map.put(state, false);
		return false;
	}
}
