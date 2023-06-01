import java.util.Arrays;
/*
Given the array nums consisting of 2n elements
in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

public class LeetcodeQuestion3
{

    public static void main(String[] args)
    {
        int [] nums = {1,2,3,4,4,3,2,1};
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n)
    {
        int ans[] = new int[2*n];
        for(int i = 0; i < (nums.length)/2; i++)
        {
            ans[2*i] = nums[i];
            ans[(2*i)+1] = nums[i+n];
        }
        return ans;
    }

}
