import java.util.Arrays;

// Leetcode Problem 1502
public class LeetcodeQuestion27E
{
    public static void main(String[] args)
    {
        int[] nums = {-68,-96,-12,-40,16};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(AP(nums));
    }
    static boolean AP(int[]nums)
    {
        int difference = nums[1]-nums[0];
        int i = 1;
        while(i < nums.length-1)
        {
            if(nums[i+1] - nums[i] == difference)
            {
                i++;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    static void selectionSort(int[] nums)
    {
        int i =0;
        while(i < nums.length)
        {
            int start = 0;
            int end = nums.length - i - 1;
            int max = getmax(nums,start,end);
            swap(nums,max,end);
            i++;
        }

    }
    static int getmax(int[] nums, int start, int end)
    {
        int max = 0;
        for(int i = 0; i <= end; i++)
        {
            if(nums[i] > nums[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] nums,int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


}
