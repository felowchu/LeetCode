package leetcode;
/*感觉写出了标准答案*/
public class OJ055_JumpGameII {
    public boolean canJump(int[] nums){
        int n = nums.length;
        if(n == 0) return true;
        int pre = 0, next = nums[0];
        while(next < n-1 && pre < next ){
            pre++;
            next = Math.max(next, pre+nums[pre]);
        }
        return next >= n-1;
    }
}
