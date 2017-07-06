package leetcode;

public class OJ004_MedianOfTwoSortedArrays {
	public static void main(String[] args){
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		OJ004_MedianOfTwoSortedArrays oj = new OJ004_MedianOfTwoSortedArrays();
		double b = oj.findMedian(nums1, nums2);
		System.out.println(b);
	}
	
	public double findMedian(int[] nums1, int[] nums2){
		int[] aux = new int[nums1.length+nums2.length];
		int j = 0;
		int k = 0;
		double median;
		for(int i=0; i<aux.length; i++){
			if(j >= nums1.length)          aux[i] = nums2[k++];
			else if(k >= nums2.length)     aux[i] = nums1[j++];
			else if(nums2[k] > nums1[j])   aux[i] = nums1[j++];
			else                           aux[i] = nums2[k++];
			for(int m = 0; m < aux.length; m++){
				System.out.print(aux[m]);
			}
			System.out.println();
		}
		if(aux.length%2 == 0){
			median = (double)(aux[(aux.length-1)/2]+aux[aux.length/2])/2;
		}
		else   median = (double)aux[aux.length/2];
		return median;
	}
}
