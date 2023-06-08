import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetcodeQuestion28E
{ //Leetcode problem 448
    public static void main(String[] args)
    {
        int[] nums = {4,3,2,7,8,2,3,1};
        CyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static ArrayList<Integer> CyclicSort(int[] nums)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length)
        {
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex])
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
            if(nums[j]!= j+1)
            {
                list.add(j+1);
            }
        }
        return list;
    }
    static void swap(int[]nums, int correctIndex, int i)
    {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }


}
