import java.util.Arrays;
// Leetcode problem 217

public class LeetcodeQuestion33E
{
    public static void main(String[] args)
    {
        int[] nums = {0};// i = 1, j = 0
        InsertionSort(nums);
        System.out.println(InsertionSort(nums));
    }
    static boolean InsertionSort(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            int temp = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] >= temp)
            {
                if(nums[j-1] == temp)
                {
                    return true;
                }
                else
                {
                    nums[j] = nums[j-1];
                    j--;
                }
            }
            nums[j] = temp;
        }
        return false;
    }
}
