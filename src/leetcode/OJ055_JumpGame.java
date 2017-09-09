package leetcode;

import java.util.HashSet;
/*复杂度稍微高了一点，74/75的通过率*/
public class OJ055_JumpGame {
    public static void main(String[] args){
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        int n = nums.length;
        if(n == 0) return true;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 0; i < n; i++){
            if(set.contains(i)){
                if(i + nums[i] >= n-1) return true;
                for(int j = i + 1; j <= i + nums[i]; j++){
                    set.add(j);
                }
            }else break;
        }
        return false;
    }
}
