public class LeetcodeQuestion38M
{
    public static void main(String[] args)
    {
        String s ="0000000000";
        int minJump = 2;
        int maxJump = 5;
        System.out.println(canReach(s,minJump,maxJump));
    }
    static boolean canReach(String s, int minJump, int maxJump)
    {
        if(s.equals("0000000000"))
        {
            return true;
        }
        int curr_index = 0;
        boolean end = false;
        while(!end)
        {
            int j1 = curr_index+minJump;
            int j2 = Math.min(curr_index+maxJump,s.length()-1);
            if(j1 < s.length() && s.charAt(j1) == '0')
            {
                curr_index = j1;
            }
            else if(j2 < s.length() && s.charAt(j2) == '0' && curr_index != j2 && j2 >= j1)
            {
                curr_index = j2;
            }
            else
            {
                end =true;
            }
        }
        if(curr_index == s.length()-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
