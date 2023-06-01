import java.util.Arrays;
import java.util.Scanner;

public class SearchAndString
{
    /*
    name.tocharArray() converts string into character array
    for-each loop is only applicable for arrays
    Arrays.toString() outputs the value of each element of the
    array in enclosed bracket []

     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = "Vedang";
        char target = 'd';
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static int search(String str, char target)
    {
        if(str.length() == 0)
        {
            return -1;
        }
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == target)
            {
                return i;
            }
        }

        return -1;
    }

    static boolean search2(String str, char target)
    {
        for(char ch: str.toCharArray())
        {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }

}
