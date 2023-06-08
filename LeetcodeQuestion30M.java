import java.util.ArrayList;

public class LeetcodeQuestion30M
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,2};
        sort(nums);
    }
    static ArrayList<Integer> sort(int[] nums)
    {
        ArrayList<Integer>list = new ArrayList<>();
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
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
                list.add(nums[j]);
            }
        }
        return list;
    }

    static void swap(int[] nums, int i, int correct)
    {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
