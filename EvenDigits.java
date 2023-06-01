/*
Problem statement:
int [] nums = {12,345,2,6,789}
find the total number in array that has even number of digits
 */

public class EvenDigits
{
    public static void main(String[] args)
    {
        int [] arr = {12,345,2,6,789};
        int answer = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int digits = 0;
            while(arr[i] > 0)
            {
                digits++;
                arr[i] = (arr[i])/10;
            }
            if(digits%2 == 0)
            {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
