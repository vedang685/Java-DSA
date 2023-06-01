public class LeetcodeQuestion22E
{
    public static void main(String[] args)
    {

    }
    static int guessNumber(int n)
    {
        int start = 1;
        int end = n;
        while(start <= end)
        {
            int mid = (start+end)/2;
            int result = guess(mid);
            if(result == -1)
            {
                end = mid-1;
            }
            if(result == 1)
            {
                start = mid+1;
            }
            if(result == 0)
            {
                return mid;
            }
        }
        return -1;
    }
    static int guess(int n)
    {
        return -1;
    }
}
