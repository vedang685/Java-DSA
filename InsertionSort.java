import java.util.Arrays;

public class InsertionSort
{
    // sort array till index i by putting the element at correct position
    // j > 0 and i <= n-2
    // when element j is not smaller than the j-1 element break the loop
    // Worst case O(n2) // Best case O(n)
    public static void main(String[] args)
    {
        int[] nums = {5,3,4,1,2};
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void InsertionSort(int[] nums)
    {
        for(int i = 1; i < nums.length; i++) // Let's suppose i = 2, then the array is
            // sorted until index 1
        {
            int j = i;
            int temp = nums[j];
            while(j > 0 && nums[j-1] > temp)
            {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
    }

}
