// Square root of a number
public class LeetcodeQuestion21E
{
    public static void main(String[] args)
    {
        int x = 2147395599;
        System.out.println(squareroot(x));
    }
    static int squareroot(int x)
    {
        int start = 1;
        int end = x;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(mid == x/mid)
            {
                return mid;
            }
            if(mid > x/mid)
            {
                end = mid-1;
            }
            if(mid < x/mid)
            {
                start = mid+1;
            }
        }
        return end;
    }

}
