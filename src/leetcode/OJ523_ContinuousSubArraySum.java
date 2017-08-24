package leetcode;

import java.util.HashMap;

public class OJ523_ContinuousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0) sum %= k;
            Integer pre = map.get(sum);
            if(pre != null){
                if(i - pre > 1) return true;
            }else {
                map.put(sum, i);
            }
        }
        return false;
    }
}
