package li.jesse.leetcode;

/*
#217 Contains Duplicate
Easy

Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.
 */

public class ContainsDuplicate
{
    public static boolean containsDuplicate(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] == nums[j])
                {
                    return true;
                }
            }
        }

        return false;
    }
}
