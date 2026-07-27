class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,nums,target,0);
    }
    public int solve(int i ,int[] nums,int target,int curr){
        if(i == nums.length) return (curr == target) ? 1 : 0;

        int plus = solve(i+1 , nums, target, curr + nums[i]);
        int minus = solve(i+1 , nums, target, curr - nums[i]);

        return plus + minus;
    }
}