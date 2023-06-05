public class LeetcodeQuestion26E
{
    // leetcode Problem 1232
    public static void main(String[] args) {
        int[][] coordinates = {
                {-4,-3},
                {1,0},
                {3,-1},
                {0,-1},
                {-5,2}
        };
        System.out.println(straightLine(coordinates));
    }
    static boolean straightLine(int[][] coordinates)
    {
        int i = 0;
        int j = 0;
        double slope = 0;
        double slope_in = 0;
        boolean Iszero = false;
        if((coordinates[1][0] - coordinates[0][0]) == 0)
        {
            Iszero = true;
            slope_in = (coordinates[1][1] - coordinates[0][1]);
            slope = slope_in;
        }
        else
        {
            slope_in = (double)(coordinates[1][1] - coordinates[0][1])/(double) (coordinates[1][0] - coordinates[0][0]);
            slope = slope_in;
        }
        while (slope == slope_in && i < coordinates.length-2 && !Iszero)
        {
            i++;
            if(coordinates[i+1][j] - coordinates[i][j] == 0)
            {
                return false;
            }
            slope =  (double)(coordinates[i+1][j+1] - coordinates[i][j+1])/(double)(coordinates[i+1][j] - coordinates[i][j]);

        }
        while (i < coordinates.length-2 && Iszero)
        {
            i++;
            if((coordinates[i+1][j] - coordinates[i][j]) != 0)
            {
                return false;
            }
        }
        if(i == coordinates.length-2 && slope == slope_in)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
