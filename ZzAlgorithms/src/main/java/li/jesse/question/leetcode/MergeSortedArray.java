package li.jesse.question.leetcode;

/*
#88 Merge Sorted Array
Easy

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
The number of elements initialized in nums1 and nums2 are m and n respectively.
 */

public class MergeSortedArray
{
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n)
    {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (k >= 0)
        {
            if (i < 0)
            {
                nums1[k--] = nums2[j--];
                continue;
            }

            if (j < 0)
            {
                break;
            }

            if (nums1[i] > nums2[j])
            {
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
