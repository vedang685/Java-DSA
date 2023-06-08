import java.util.Arrays;

public class LeetcodeQuestion32H
{
    public static void main(String[] args)
    {
        int[] nums = {1};
        sort(nums);
        System.out.println(sort(nums));
    }
    static int sort(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(correct >= 0 && correct < nums.length && nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] nums, int i, int correct)
    {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
