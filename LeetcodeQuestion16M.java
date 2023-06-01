import java.io.FilterOutputStream;

public class LeetcodeQuestion16M
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = peakIndex(nums);
        int firstIndex = orderAgnosticBS(nums,target,0,peak);
        int lastIndex = orderAgnosticBS(nums,target,peak,nums.length-1);
        int answer = Math.min(firstIndex,lastIndex);

    }

    static int peakIndex(int[] nums)
    {
        int s = 0;
        int e = nums.length - 1;
        while(s < e)
        {
            int mid = (s+e)/2;
            if(nums[mid] > nums[mid+1])
            {
                e = mid;
            }
            else
            {
                s = mid+1;
            }
        }

        return s;
    }

    static int orderAgnosticBS(int[] arr, int element,int s, int e)
    {
        if(arr[s] < arr[e])
        {
            while(s<=e)
            {
                int mid = (s+e)/2;
                if(arr[mid] == element)
                {
                    return mid;
                }
                else if (arr[mid] > element)
                {
                    e = mid-1;
                }
                else
                {
                    s = mid+1;
                }

            }
        }
        else
        {
            while(s<=e)
            {
                int mid = (s+e)/2;
                if(arr[mid] == element)
                {
                    return mid;
                }
                else if (arr[mid] < element)
                {
                    e = mid-1;
                }
                else
                {
                    s = mid+1;
                }

            }
        }

        return -1;
    }

}
