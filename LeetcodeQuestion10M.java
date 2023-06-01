import java.util.Arrays;
//https://leetcode.com/problems/sort-the-students-by-their-kth-score
public class LeetcodeQuestion10M
{
    public static void main(String[] args)
    {
        int[][] score = {
                {10,6,9,1},
                {7,5,11,2},
                {4,8,3,15}
        };
        int k = 2;
        System.out.println(Arrays.toString(sortTheStudents(score,k)[1]));
    }

    static int[][] sortTheStudents(int[][] score, int k)
    {
        int ans[][] = new int[score.length][score[0].length];
        int max = 0;
        int index = 0;
        int length = score.length;
        int l = 0;
        while(length > 0)
        {
            for(int i = 0; i < score.length; i++)
            {
                if(score[i][k] > max)
                {
                    max = score[i][k];
                    index = i;
                }
            }
            max = 0;
            for(int i = 0; i < score[l].length; i++)
            {
                ans[l][i] = score[index][i];
            }
            score[index][k] = 0;
            l++;
            length--;
        }
        return ans;

    }
}
