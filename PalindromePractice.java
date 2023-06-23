public class PalindromePractice
{
    public static void main(String[] args)
    {
        String s = "Hello";
        if(Palindrome(s))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
    static boolean Palindrome(String s)
    { //Hello s.length() = 5
        int j = s.length()-1;
        for(int i = 0; i < s.length()/2; i++)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}

