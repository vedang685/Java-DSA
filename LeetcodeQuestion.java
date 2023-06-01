import java.util.Arrays;
/*
Difficulty: Medium
Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in ascending order, find the starting and
ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with 0 (log n) runtime complexity.
 */
public class LeetcodeQuestion
{
    public static void main(String[] args)
    {
        int [] arr = {7, 7, 7, 7, 7, 7};
        int target = 7;
        System.out.println(Arrays.toString(FirstandLast(arr,target)));
    }

    static int[] FirstandLast(int[] arr, int target)
    {
        int[] ans = new int[2];
        // to find the first index
        ans[0] = SearchRange(arr,target, true);
        // to find the last index
        ans[1] = SearchRange(arr, target, false);
        return ans;

    }
    static int SearchRange(int[] arr, int target, boolean StartIndex)
    {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        int mid;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(arr[mid] == target)
            {
                // potential answer is found
                ans = mid;
                if(StartIndex)
                {
                    // to find the first index
                    /*
                    It will store the middle value and then check the bool expression
                    if yes then it will search for the same value in previous elements
                    when e = mid - 1
                    it will again find the mid value if mid is again equal to target then
                    it will store the mid value in ans and then again checks the bool
                    expression and the same thing will repeat until condition is break

                     */
                    e = mid - 1;
                }
                else
                {
                    // to find the last index
                    /*
                    It will store the middle value and then check the bool expression
                    if false then it will search for the same value in next elements
                    when s = mid + 1
                    it will again find the mid value, if mid is again equal to target then
                    it will store the mid value in ans and then again checks the bool
                    expression and the same thing will repeat until condition is break

                     */
                    s = mid + 1;
                }

            }
            else if(arr[mid] > target)
            {
                e = mid - 1;
            }
            else if(arr[mid] < target)
            {
                s = mid + 1;
            }
        }
        return ans;
    }

}
