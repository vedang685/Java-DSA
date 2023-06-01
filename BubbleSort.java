import java.util.Arrays;

// Constant comparison of elements
// The largest element gets to the last in first iteration
// the second largest element gets to the second last position in second iteration
// Also know as SYNCING SORT OR EXCHANGE SORT
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] nums ={6,3,6,9,0,3,6};
        bubblesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubblesort(int[]nums)
    {
        boolean swapped = false;
        int j = nums.length-1;
        while(j > 0)
        {
            for(int i = 0; i < j; i++)
            {
                if(nums[i] > nums[i+1])
                {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) // means array is already sorted
            {
                break;
            }
            j--;
        }
    }
}
