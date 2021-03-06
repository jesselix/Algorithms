package li.jesse.leetcode;

public class SearchInsertPosition {

	public static int searchInsertPosition(int[] nums, int target) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}

		for(int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {
				return i;
			}
			else {
				if (i == nums.length - 1) {
					return nums.length;
				}
			}
		}

		return 0;
	}

	public static int searchInsertPosition2(int[] nums, int target) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}

		int left = 0;
		int right = nums.length - 1;
		int middle;

		while (left <= right) {
			middle = (left + right) / 2;
			if (target == nums[middle]) {
				return middle;
			} else if (target < nums[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}

		return left;
	}

}
