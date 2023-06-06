import java.util.Arrays;
import java.util.Scanner;
// Using test cases to solve a problem

public class newProblem
{
    public static void main(String[] args)
    {
        // Test case
        Scanner in = new Scanner(System.in);
        int T;
        T = in.nextInt();
        while(T > 0)
        {
            int N = in.nextInt(); int M = in.nextInt();
            int matrix[][] = new int[N][M];
            for(int i =0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    matrix[i][j] = in.nextInt();
                }
            }
            System.out.println();
            findzero(matrix);
            for(int i = 0; i < matrix.length; i++)
            {
                System.out.println(Arrays.toString(matrix[i]));
            }
            T--;
        }
    }
    static int[][] findzero(int[][] matrix)
    {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = -1;
                    column[j] = -1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(row[i] == -1 || column[j] == -1)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
