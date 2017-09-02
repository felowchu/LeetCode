package leetcode;

public class OJ011_ContainerWithMostWater2 {
	
public int maxArea(int[] height) {
	int area = 0;
	int i = 0;
	while(i < height.length-1){
		int temp = height[i];
		int j = height.length-1;
		while(j > i){
			int k = j - i;
			if(height[i] <= height[j] && height[i]*k > area){
				area = height[i]*k;
			}
			else if(height[i] > height[j] && height[j]*k > area){
				area = height[j]*k;
			}
			j--;
			while(height[j] < height[height.length - 1] && j > i){
				j--;
			}
		}
		i++;
		while(height[i] < temp && i < height.length - 1){
			i++;
		}
	}
	return area;
    }
}
