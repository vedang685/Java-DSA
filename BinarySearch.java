/*
Time complexity:
Best case : omega(1) constant time if arr[mid] == element
Worst case : O(logN) base 2
 */

public class BinarySearch
{
    public static void main(String[] args)
    {
       int[] arr = {2,4,6,9,11,12,14,20,36,48};
       int element = 9;
       int s = 0;
       int e = arr.length-1;
       while(s<=e)
       {
           int mid = (s+e)/2;
           if(arr[mid] == element)
           {
               System.out.println("Found at index " + (mid+1));
               return;
           }
           else if(arr[mid] > element)
           {
               e = mid-1;
           }
           else
           {
               s = mid+1;
           }
       }

    }
}
