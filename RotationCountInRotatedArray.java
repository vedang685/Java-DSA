public class RotationCountInRotatedArray
    //Important
{
    public static void main(String[] args)
    {
        int[] nums ={4,5,6,7,8,1,2,3};
        /*
        Let the original number = 1,2,3,4,5,6,7,8
        The number of times an array has been rotated = index of pivot+1
         */
        int number_of_rotation = Rotaioncount(nums)+1;
        System.out.println(number_of_rotation);
    }
    static int Rotaioncount(int[] nums)
    {
        int s = 0; int e = nums.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mid < nums.length-1 && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(mid > s && nums[mid] < nums[mid-1])
            {
                return mid-1;
            }
            if(nums[s] > nums[mid])
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
