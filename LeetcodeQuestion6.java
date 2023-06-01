import java.util.Arrays;
/*
Given an array nums. We define a running sum of an array as
runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */

public class LeetcodeQuestion6
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums)
    {
        int [] ans = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < ans.length; i++)
        {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
