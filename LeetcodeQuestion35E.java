public class LeetcodeQuestion35E
{
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address)
    {
        String s = "";
        int i = 0;
        while(i < address.length())
        {
            if(address.charAt(i) == '.')
            {
                s = s + "[.]";
                i++;
            }
            else
            {
                s = s + address.charAt(i);
                i++;
            }
        }
        return s;
    }
}
