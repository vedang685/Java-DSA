import java.util.Arrays;
import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
        /*
            Syntax:
            datatype[] variable_name = new datatype[size];
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        change(arr);
        /*
        Arrays are mutable in nature and hence their values can be changed
        by passing the value  in a function
         */

//        System.out.println(Arrays.toString(arr));

        /*
        Multidimensional arrays:
        syntax:
        int [][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
         No of columns are not necessary to mention as the 2D array can
         have variable number of columns
         mentioning number of rows are necessary
         hence,
         int [][] arr = new int [3] [] is acceptable

         in the heap memory it is stored as
         arr = { [1,2,3] , [4,5,6] , [7,8,9] }
         so arr[0] will give 1,2,3;

         */

        int [][] arr2 = {
                            {1,2,3},
                            {4,5},
                            {6,7,8,9}
                         };
        /*
        stored as:
        arr2 = { [1,2,3] , [4,5] , [6,7,8,9] }
        arr2[0] = [1,2,3]
        arr2[0][2] = 3
         */
        for(int i = 0; i < arr2.length; i++)
        {
            // arr2.length = 3 = number of rows in arr2

            for(int j = 0; j < arr2[i].length; j++)
            {
                /*
                arr2[row].length gives the length of array of that
                particular row
                 */
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        // Alternate method to output 2D array
        /*
        Enhanced for loop
        for-each loop
        syntax:
        for(datatype item: array)
        {
            ..
        }

        for every element in array perform specific task

         */
        for (int[] element : arr2)
        {
            System.out.println(Arrays.toString(element));
        }

        // using normal for loop

        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(Arrays.toString(arr2[i]));

        }
        // arr2[0] = 1,2,3
        // arr2[1] = 4,5
        // arr2[2] = 6,7,8,9

    }
    static void change(int[] arr)
    {
        arr[0] = 99;
    }

}
