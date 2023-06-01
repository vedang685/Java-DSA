public class LeetcodeQuestion15M
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s < e)
        {
            int mid = (s+e)/2;
            if(arr[mid] > arr[mid+1])
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

}
