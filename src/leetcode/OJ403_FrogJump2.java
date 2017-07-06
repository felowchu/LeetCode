package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class OJ403_FrogJump2 {
	public static void main(String[] args){
		OJ403_FrogJump2 fj = new OJ403_FrogJump2();
		int[] stones = {0,1,3,6,10,15,19,21,24,26,30,33};
		System.out.println(fj.canCross(stones));
	}
	public boolean canCross(int[] stones){
		int n = stones.length;
		if(n == 0 && stones[0] == 0) return true;
		HashMap<Integer, HashSet<Integer>> cache = new HashMap<Integer, HashSet<Integer>>();
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		cache.put(0, set);
		for(int i = 1; i < n; i++){
			cache.put(stones[i], new HashSet<Integer>());
		}
		for(int i = 0; i < stones.length; i++){
			for(int k : cache.get(stones[i])){
				if(stones[i] + k == stones[n - 1])
					return true;
				if(cache.containsKey(stones[i] + k)){
					HashSet<Integer> temp = cache.get(stones[i] + k);
					if(k > 1) temp.add(k - 1);
					temp.add(k);
					temp.add(k + 1);
				}
			}
		}
		return false;
	}
}
