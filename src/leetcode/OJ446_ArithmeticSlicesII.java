package leetcode;

import java.util.HashMap;

public class OJ446_ArithmeticSlicesII {
	public int numberOfArithmeticSlices(int[] A){
		int n = A.length;
		if(n <= 2) return 0;
		HashMap<Integer, Integer>[] maps = new HashMap[n];
		for(int i = 0; i <n; i++){
			maps[i] = new HashMap<Integer,Integer>(i);
		}
		int res = 0;
		for(int i = 1; i < n; i++){
			for(int j = 0; j < i; j++){
				long diff = A[i] - A[j];
				if(diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE)
					continue;
				int cont = maps[j].getOrDefault((int)diff, 0);
				maps[i].put((int) diff, maps[i].getOrDefault((int)diff, 0) + cont + 1);
				res += cont;
			}
		}
		return res;
	}
}
