import java.util.Arrays;
import java.util.Scanner;

/*
Scoping:
anything initialised inside the block cannot be used outside the block
anything initialised outside the block can be used inside the block
*/

public class Functions
{
    static int x = 40;
    public static void main(String[] args)
    {
        multiple(12,3,4);// VarArgs
        System.out.println(x);
        x = 20; //Shadowing

        /*
        Shadowing:
        It is a method by which we can assign new value to the
        variable that has been initialised earlier
        and will take new value hence shadowing its previous
        value
         */

        System.out.println(x);

        //Function Overloading
        fun(30,40);
        fun("Vedang");
    }
/*
Swapping doesn't work if used in a function because in swap
the argument is passed as value and not as reference hence,
the int a and int b is different from the main function
and will point to the same value;
if a new value is assigned to int a, it will point to the new
value or object and hence the int a in main will still point to
the original value of a;
 */
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    // Variable Arguments
    /*
    It is used to pass several variables as arguments
    Syntax:
    static void fun(int ...v)
    {
        }
    v = can be any name
    int = can be any datatype
     */
    static void multiple(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    /*
    FUNCTION OVERLOADING
    if two functions are with same name but the arguments inputs
    different data types then there will be no error in compiler
    it will accept it as two different functions;
    either number of arguments should be different or types of
    arguments should be different
     */
    static void fun(int a, int b)
    {
        System.out.println(a);
    }

    static void fun(String a)
    {
        System.out.println(a);
    }



}
