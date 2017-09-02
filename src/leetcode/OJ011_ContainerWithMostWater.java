package leetcode;

public class OJ011_ContainerWithMostWater {
	public int maxArea(int[] height){
		int area = 0;
		for(int i = 1; i < height.length; i++){
			for(int j = i+1; j <= height.length; j++){
				if(height[i-1] <= height[j-1] && height[i-1]*(j - i) > area){
					area = height[i-1]*(j - i);
				}
				else if(height[i-1] > height[j-1] && height[j-1]*(j - i) > area){
					area = height[j-1]*(j - i);
				}
			}
		}
		return area;
	}
}
