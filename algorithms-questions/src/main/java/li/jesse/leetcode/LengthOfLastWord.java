package li.jesse.leetcode;

/*
58. Length of Last Word
Easy

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5.
 */

public class LengthOfLastWord
{
    public static int lengthOfLastWord(String s)
    {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}