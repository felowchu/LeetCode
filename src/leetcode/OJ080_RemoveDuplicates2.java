package leetcode;

public class OJ080_RemoveDuplicates2 {
    public int removeDuplicates(int[] nums){
        int i = 0;
        for(int n : nums)
            if(i < 2 || nums[i-1] != n)
                nums[i++] = n;
        return i;
    }
}
