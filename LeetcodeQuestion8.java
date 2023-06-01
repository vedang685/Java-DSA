import java.util.ArrayList;
import java.util.List;

public class LeetcodeQuestion8
{
    public static void main(String[] args)
    {
        int[] candies = {4,2,1,1,2};
        int extracandies = 1;
        System.out.println(kidsWithCandies(candies,extracandies));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int max = maxCandies(candies);
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }

    static int maxCandies(int [] candies)
    {
        int max = 0;
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        return max;
    }

}
