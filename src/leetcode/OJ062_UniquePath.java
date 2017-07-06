package leetcode;

public class OJ062_UniquePath {
	public static void main(String[] args){
		int m = 4,n = 4;
		System.out.println(uniquePath(m, n));
	}
	public static int uniquePath(int m, int n){
		int[] matrix = new int[n];
		for(int j = 0; j < n; j++){
			matrix[j] = 1;
		}
		for(int i = m - 2; i >= 0; i--){
			for(int j = n - 2; j >= 0; j--){
				matrix[j] = matrix[j] + matrix[j + 1];
			}
		}
		return matrix[0];
	}
}
