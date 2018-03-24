package li.jesse.leetcode;

/*
198. House Robber
Easy

You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses
have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house,
determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber
{
    public static int rob(int[] nums)
    {
        if(nums.length <= 1){
            return nums.length == 0 ? 0 : nums[0];
        }
        // a是上次的最大收益
        int a = nums[0];
        // b是当前的最大受益
        int b = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            int tmp = b;
            // 当前的最大收益是两种选择里较大的那个
            b = Math.max(a + nums[i], b);
            a = tmp;
        }
        return b;
    }
}
