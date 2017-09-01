package leetcode;

public class OJ031_NextPermutation {
    public static void main(String[] args){
        OJ031_NextPermutation oj = new OJ031_NextPermutation();
        int[] num = {1, 5, 1};
        oj.nextPermutation(num);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public void nextPermutation(int[] nums){
        int n = nums.length;
        if(n < 2) return;
        int index = n-1;
        while (index > 0){
            if(nums[index] > nums[index-1]) break;
            index--;
        }
        if(index == 0){
            reverse(nums, 0, n-1);
            return;
        }
        int val = nums[index-1];
        int j = n-1;
        while(j >= index && nums[j] <= val) j--;
        swap(nums, index-1, j);
        reverse(nums, index, n-1);
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int start, int end){
        if(start >= end)
            return;
        int len = (start + end)/2;
        for(int i = start; i <= len; i++){
            swap(nums, i, start + end - i);
        }
    }
}
