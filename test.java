public class test {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(palindrome(num));
    }
    static boolean palindrome(int num)
    {
        if(num < 0)
        {
            return false;
        }
        String s = Integer.toString(num);
        int start = 0;
        int end = s.length()-1;
        while(start < end)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
