package li.jesse.leetcode;

public class MissingNumber
{
	public static int missingNumber(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] != i)
			{
				return i;
			}
		}
		
		return 1;
	}
}
