import java.util.Arrays;
//Leetcode problem 268
public class practice2
{
    public static void main(String[] args) {
        int[] nums = {4,3,1,0};
        System.out.println(CyclicSort(nums));
    }
    static int CyclicSort(int[] nums)
    {
        int i = 0;
        while (i < nums.length)
        {
            int correctIndex = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correctIndex])
            {
                swap(nums,correctIndex,i);
            }
            else
            {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j)
            {
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums,int correctIndex, int i) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }

}
