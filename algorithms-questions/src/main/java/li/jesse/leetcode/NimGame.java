package li.jesse.leetcode;

public class NimGame
{
    public static boolean canWinNim(int n)
    {
        int val = n % 4;

        if(val >= 1 && val <= 3)
            return true;

        return false;
    }
}
