package leetcode;

public class OJ075_SortColors {
    public void sortColors(int[] nums){
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        int i = 0;
        while (i++ < count0) nums[i-1] = 0;
        i--;
        while (i++ < count1+count0) nums[i-1] = 1;
        i--;
        while (i++ < count2+count1+count0) nums[i-1] = 2;
    }
}
