import java.util.ArrayList;
import java.util.Arrays;

/*
Problem statement:
Given a characters array letters that is sorted in non-decreasing order and a character
target, return the smallest character in the array that is larger than target.
Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'
 */

public class SmallestLetterGreaterThanTarget
{
    public static void main(String[] args)
    {
        char [] letters = {'a', 'b'};
        int target = 'z';
        int[] asciLetters = new int[letters.length];
        for(int i = 0; i < letters.length; i++)
        {
            asciLetters[i] = letters[i];
        }

        int s = 0;
        int e = letters.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(asciLetters[mid] == target)
            {
                System.out.println((char)asciLetters[mid]);
                return;
            }
            else if(asciLetters[mid] > target)
            {
                e = mid - 1;
            }
            else
            {
                if(s == asciLetters.length-1)
                {
                    s = 0;
                    System.out.println((char)asciLetters[s]);
                    return;
                }
                else
                {
                    s = mid + 1;
                }
            }
        }
        System.out.println((char)asciLetters[s]);
    }
}
