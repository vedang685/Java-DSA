public class LeetcodeQuestion36E
{
    public static void main(String[] args)
    {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices)
    {
        StringBuilder u = new StringBuilder(s);
        int i = 0;
        while (i < s.length())
        {
            if(indices[i] != i)
            {
                u.deleteCharAt(indices[i]);
                u.insert(indices[i],s.charAt(i));
                i++;
            }
            else
            {
                i++;
            }
        }
        return u.toString();
    }
}
