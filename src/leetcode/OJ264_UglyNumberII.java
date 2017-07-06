package leetcode;

public class OJ264_UglyNumberII {
	public int nthUglyNumber(int n){
		if(n <= 0)
			return 0;
		int[] array = new int[n];
		array[0] = 1;
		int i2 = 0, i3 = 0, i5 = 0; 
		for(int i = 1; i < n; i++){
			int num = Math.min(Math.min(array[i2]*2, array[i3]*3), array[i5]*5);
			if(array[i2] * 2 == num) i2++;
			if(array[i3] * 3 == num) i3++;
			if(array[i5] * 5 == num) i5++;
			array[i] = num;
		}
		return array[n - 1];
	}
}
