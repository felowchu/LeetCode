package DynamicProgram;

public class OJ053_MaximumSubarry {
    public int maxSubArry(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        int res = nums[0], sum = nums[0];
        for(int i = 1; i < n; i++){
            if(sum <= 0) sum = nums[i];
            else sum += nums[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}
