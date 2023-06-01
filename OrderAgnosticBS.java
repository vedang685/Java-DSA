/*
The order of the array is not known i.e. whether it is ascending or
descending
 */

public class OrderAgnosticBS
{
    public static void main(String[] args)
    {
        int[] arr = {99, 80, 75, 22, 11 ,10, 5, 2, -3};
        int s = 0;
        int e = arr.length - 1;

        boolean isAscending = arr[s] < arr[e];

        int element = 22;

        System.out.println("Found at Index "+ (orderAgnosticBS(arr, element, isAscending,s,e)+1));
    }

    static int orderAgnosticBS(int[] arr, int element, boolean isAscending, int s, int e)
    {
        if(isAscending)
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
