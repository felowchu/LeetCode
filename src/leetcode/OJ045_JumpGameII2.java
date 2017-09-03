package leetcode;

public class OJ045_JumpGameII2 {
    public int jump(int[] nums){
        int sc = 0, end = 0, max = 0;
        for(int i = 0; i < nums.length-1; i++){
            max = Math.max(max, i+nums[i]);
            if(i == end) {
                sc++;
                end = max;
            }
        }
        return sc;
    }
}
