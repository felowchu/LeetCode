package leetcode;

public class OJ011_3 {
	public int maxArea(int[] height) {
		int area = 0;
		int len = height.length;
		for(int i = 0; i < len; i++){
			int j = 0;
			int k = len-1;
			while(j < i && height[j] < height[i]){
				j++;
			}
			while(k > i && height[k] < height[i]){
				k--;
			}
			int area1 = height[i]*Math.max(i-j, k-i);
			if(area1 > area) area = area1;
		}
		return area;
	}
}
