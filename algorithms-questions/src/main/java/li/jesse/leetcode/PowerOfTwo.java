package li.jesse.leetcode;

public class PowerOfTwo
{
    public static boolean isPowerOfTwo(int n)
    {
        return n > 0 && ((n & (n - 1)) == 0 );
    }
}
