public class LeetcodeQuestion11
{
    public static void main(String[] args)
    {
        String sentence = "anmt";
        if(checkIfPangram(sentence))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    static boolean checkIfPangram(String sentence)
    {
        int[] arr = new int[26];
        int val = 97;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = val;
            val++;
        }
        char[] chararr = sentence.toCharArray();
        for(int i = 0; i < chararr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if((int)chararr[i] == arr[j])
                {
                    arr[j] = 0;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]!= 0)
            {
                return false;
            }
        }
        return true;
    }
}
