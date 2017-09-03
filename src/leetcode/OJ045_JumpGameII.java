package leetcode;

public class OJ045_JumpGameII {
    public static void main(String[] args){
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums){
        int[] cache = new int[nums.length];
        for(int i = 0; i < cache.length; i++)
            cache[i] = Integer.MAX_VALUE;
        return dfs(nums, 0, cache);
    }

    public static int dfs(int[] nums, int start, int[] cache){
        if(start == nums.length-1) return 0;
        if(start > nums.length-1) return 1;
        if(cache[start] != Integer.MAX_VALUE)
            return cache[start];
        for(int i = start + 1; i <= start+nums[start]; i++){
            int jump = dfs(nums, i, cache);
            cache[start] = Math.min(cache[start], jump+1);
        }
        return cache[start];
    }
}
