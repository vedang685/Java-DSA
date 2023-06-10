public class LeetcodeQuestion37E
{
    public static void main(String[] args)
    {
        String command ="G()()()()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command)
    {
        StringBuilder s = new StringBuilder();
        int i = 0;
        while(i < command.length())
        {
            if(command.charAt(i) == 'G')
            {
                s.append('G');
                i++;
            }
            else if (command.charAt(i) == '(')
            {
                if(command.charAt(i+1) == 'a')
                {
                    s.append("al");
                }
                else
                {
                    s.append("o");
                }
                i++;
            }
            else
            {
                i++;
            }
        }
        return s.toString();
    }

}
