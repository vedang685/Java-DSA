public class InfiniteArray
{
    public static void main(String[] args)
    {
        int[] nums = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 23;
        System.out.println(infiniteArraySearch(nums,target));
    }

    static int infiniteArraySearch(int[] nums, int target)
    {
        int s = 0;
        int e = 1;
        while(nums[e] < target)
        {
            int size = (e-s)+1;
            s = e+1;
            e = s + 2*size - 1;

        }

        return binarySearch(nums,s,e,target);

    }

    static int binarySearch(int[] nums, int s, int e, int target)
    {
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return -1;
    }


}
