import java.util.Arrays;

/*
Given an integer array nums of length n,
you want to create an array ans of length 2n where
ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.
 */

public class LeetcodeQuestion5
{
    public static void main(String[] args)
    {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums)
    {
        int[] ans = new int [2*(nums.length)];
        int n = ((ans.length)/2)-1;
        for(int i = 0; i < ans.length; i++)
        {
            if(i > n)
            {
                ans[i] = nums[i-(n+1)];
            }
            else
            {
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
