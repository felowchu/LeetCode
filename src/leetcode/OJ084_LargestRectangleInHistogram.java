package leetcode;

public class OJ084_LargestRectangleInHistogram {
    public static void main(String[] args){
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights){
       int max = maxArea(heights, 0 , heights.length-1);
       return max;
    }

    public static int maxArea(int[] heights, int start, int end){
        if(start > end) return 0;
        int minHeight = Integer.MAX_VALUE; int index = start;
        for(int i = start; i <= end; i++){
            if(heights[i] < minHeight){
                index = i;
                minHeight = heights[i];
            }
        }
        int area = (end - start + 1) * minHeight;
        int left = maxArea(heights, start, index-1);
        int right = maxArea(heights, index+1, end);
        return Math.max(area, Math.max(left, right));
    }
}
