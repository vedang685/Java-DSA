public class LeetcodeQuestion14
{
    public static void main(String[] args)
    {
        char[] letters = {'c','f','j'};
        char target = 'k';
        System.out.println(nextGreatestLetter(letters,target));
    }

    static char nextGreatestLetter(char[] letters, char target)
    {

        int s = 0;
        int e = letters.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(letters[mid] == target)
            {
                s++;
            }
            if(letters[mid] < target)
            {
                s = mid + 1;
            }
            if(letters[mid] > target)
            {
                e = mid - 1;
            }
        }
        return letters[s % letters.length];
    }
}
