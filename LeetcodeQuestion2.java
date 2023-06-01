public class LeetcodeQuestion2
{
    /*
    Find position of an element in a sorted
    array of INFINITE numbers
    solution should be of o(log(n)) time complexity
     */
    public static void main(String[] args)
    {
        /*
        Approach:
        first search in the array of two elements then increase
        the size of search range by doubling the size every time
        thus creating a log(n) time complexity
         */
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 15;
        int start = 0;
        int end = 1;

        /*
        Searching for the correct size of array where our target
        is located
         */
        while(arr[end] < target)
        {
            int size = (end-start)+1;
            start = end + 1;// start = 2
            end = end + size*2; // end = 5
        }

        System.out.println("Start = " + (start+1)+" End = "+(end+1));

        System.out.println(binarySearch(arr,target,start,end)+1);



    }
    static int binarySearch(int[] arr, int target, int start, int end)
    {

        int mid = 0;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
        }
        return -1;
    }

}
