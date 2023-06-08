public class LeetcodeQuestion29M
{
    public static void main(String[] args) {

    }

    static int sort(int[] nums)
    {
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
                        return nums[i];
                    }
                }
                else
                {
                    i++;
                }
            }
    }

    static void swap(int[] nums, int i, int correct)
    {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
