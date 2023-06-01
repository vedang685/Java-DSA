import java.util.Arrays;
//Good question
/*
https://leetcode.com/problems/set-matrix-zeroes/
 */
public class LeetcodeQuestion18M
{
    public static void main(String[] args)
    {
        int matrix[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
    }
    static void setZeroes(int[][] matrix)
    {
        printmatrix(findzero(matrix));
    }

    static void printmatrix(int[][] findzero)
    {
        for (int[] row :findzero)
        {
            System.out.println(Arrays.toString(row));
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
