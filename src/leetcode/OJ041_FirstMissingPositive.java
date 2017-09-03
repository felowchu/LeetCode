package leetcode;

public class OJ041_FirstMissingPositive{
    public int firstmissingPositive(int[] nums){
        if(nums.length == 0) return 1;
        int i = 0;
        while(i < nums.length){
            if(nums[i] > nums.length || nums[i] == i+1 || nums[i] < 1) i++;
            else if(nums[nums[i] - 1] == nums[i]) i++;
            else swap(nums, nums[i]-1, i);
        }
        int index = 0;
        while(index < nums.length){
            if(index+1 == nums[index]) index++;
            else break;
        }
        return index+1;
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
