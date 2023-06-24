import java.util.Arrays;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {2,1}
        };

        int[][] matrix2 = {
                {1,2},
                {2,1}
        };

        for(int[] row: matrixMultiply(matrix,matrix2))
        {
            for(int element: row)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrixMultiply(int[][] matrix, int[][] matrix2)
    {
        int[][] matrix3 = {
                {0,0},
                {0,0}
        };
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                for(int k = 0; k < matrix2.length; k++)
                {
                    matrix3[i][j] += matrix[i][k]*matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

}
