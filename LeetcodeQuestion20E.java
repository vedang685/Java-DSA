import java.util.ArrayList;
import java.util.List;
// code for leetcode problem 989
// commit 2
// commit 3
// commit 4
public class LeetcodeQuestion20E
{
    public static void main(String[] args)
    {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        for(int i = 0; i < 11; i++)
        {
            System.out.print(addToArrayForm(num,k).get(i));
        }
    }
    static List<Integer> addToArrayForm(int[] num, int k)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0; --i)
        {
            list.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }

        while (k > 0)
        {
            list.add(0, k % 10);
            k /= 10;
        }

        return list;
    }
}
