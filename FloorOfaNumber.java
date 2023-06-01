/*
Floor = greatest number smaller or equal to the target
 */

public class FloorOfaNumber
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int s = 0;
        int e = arr.length-1;
        int mid = 0;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(arr[mid] == target)
            {
                System.out.println("floor = " + arr[mid]);
                return;
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
        System.out.println("floor = " + arr[e]);
    }
}
