package li.jesse.leetcode;

import java.util.HashSet;

public class HappyNumber
{
    public static boolean isHappy(int n)
    {
        if (n < 1)
        {
            return false;
        }

        // 用于保存中间出现的结果
        HashSet<Integer> set = new HashSet<>(32);

        int tmp;
        int newN;

        // n不为1，并且n的值不能重复出现，否则会死循环
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            newN = 0;

            while (n > 0)
            {
                tmp = n % 10;
                n /= 10;
                newN += tmp * tmp;
            }

            n = newN;
        }

        return n == 1;
    }
}
