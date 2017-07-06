/*加缓存的迭代，但当数据特别大时还是会发生TLE，不知是否是缓存命中率*/
package leetcode;
import java.util.HashMap;

public class OJ403_FrogJump {
	HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
	public static void main(String[] args){
		OJ403_FrogJump fj = new OJ403_FrogJump();
		int[] stones = {0,1,3,6,10,15,19,21,24,26,30,33};
		System.out.println(fj.canCross(stones));
	}
	public boolean canCross(int[] stones){
		return jump(stones, 0, 0);
	}
	
	public boolean jump(int[] stones, int start, int k){
		if(start == stones.length - 1)
			return true;
		if(cache.containsKey(start)){
			if(k == cache.get(start))
				return false;
		}
		for(int i = start + 1; i < stones.length; i++){
			int gap = stones[i] - stones[start];
			if(gap < k - 1) continue;
			if(gap > k + 1) return false;
			if(jump(stones, i, gap)) return true;
		}
		cache.put(start, k);
		return false;
	}
}
