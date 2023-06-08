import java.util.Arrays;

public class LeetcodeQuestion31E
{
    public static void main(String[] args)
    {
        int[] nums = {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(sort(nums)));
    }
    static int[] sort(int[] nums)
    {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length)
        {
            if(nums[i] != i+1)
            {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct])
                {
                    swap(nums, i, correct);
                }
                else
                {
                    ans[0] = nums[correct];
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j]!=j+1)
            {
                ans[1] = j+1;
            }
        }
        return ans;
    }
    static void swap(int[] nums, int i, int correct)
    {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
