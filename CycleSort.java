import java.util.Arrays;

public class CycleSort
{
    public static void main(String[] args)
    {
        int[] nums = {4,3,2,7,8,2,3,1};
        // numbers are from 1 to n hence correct place for number at nums[i] = nums[i]-1
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            int correct = nums[i] - 1; // correct index for element at nums[i]
            if(nums[i] != nums[correct])
            {
                // if the element at i is not at its correct position
                // swap with the element present at index i's correct position
                // now it will check if the swapped number is at correct position
                swap(nums,i,correct);
            }
            else
            {
                // traverse across the array to check if all elements are at correct position
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
