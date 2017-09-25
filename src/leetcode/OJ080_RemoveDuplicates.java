package leetcode;

public class OJ080_RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(nums));
    }
    public static int removeDuplicate(int[] nums){
        int n = nums.length;
        if(n == 0) return n;
        int res = 1; int temp = nums[0];
        boolean flag = true;
        for(int i = 1; i < n; i++){
            if(nums[i] == temp && flag){
                swap(nums, i, res);
                res ++;
                flag = false;
            }else if(nums[i] != temp){
                swap(nums, i, res);
                res++;
                temp = nums[res-1];
                flag = true;
            }
        }
        return res;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
