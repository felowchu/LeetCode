package leetcode;

import java.util.ArrayList;
import java.util.List;

public class OJ120_Triangle {
	public static void main(String[] args){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(-1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(-1);
		list3.add(-1);
		list.add(list1);
		list.add(list2);
		list.add(list3);
		System.out.println(minimumTotal(list));
	}
	public static int minimumTotal(List<List<Integer>> triangle){
		if(triangle == null)
			return 0;
		int size = triangle.size();
		int[] dp = new int[size];
		for(List<Integer> list : triangle){
			int pre = dp[0];
			for(int i = 1; i < list.size() - 1; i++){
				int cur = Math.min(pre, dp[i]) + list.get(i);
				pre = dp[i];
				dp[i] = cur;
			}
			dp[0] += list.get(0);
			dp[list.size() - 1] = pre+list.get(list.size() - 1);
		}
		int minPath = Integer.MAX_VALUE;
		for(int i = 0; i < size; i++){
			if(dp[i] < minPath)
				minPath = dp[i];
		}
		return minPath;
	}
}
