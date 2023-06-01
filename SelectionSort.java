import java.util.Arrays;
// Find the max element in the array then swap it from the last index
// shrink the array by size 1 from the end
// repeat step 1
public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] nums = {2,-32,0,78,1};
        Selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void Selectionsort(int[]nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            int start = 0;
            int end = nums.length - i - 1;
            int max_index = getmax(nums,start,end);
            swap(nums,max_index,end);
        }
    }
    static int getmax(int[] nums, int start, int end)
    {
        int max = start;
        for(int i = 0; i <= end; i++)
        {
            if(nums[i] > nums[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]nums, int first, int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

}
