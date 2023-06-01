import java.util.ArrayList;
import java.util.Scanner;

/*
    Array list:
    Uses a dynamic array to store the elements, it is like an array with
    no size limit
    How it works internally:
    if arraylist gets input greater than its size, then it creates
    a new array list double the size copies the element from old
    and deletes the old arraylist
 */
public class Arraylist
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67); // add element to the object
        list.add(267);
        list.add(367);
        list.add(467);

        // to check the number is in array (gives boolean value)
        System.out.println(list.contains(67));

        // to update the number in this list
        list.set(0,99);

        // to remove the number from the list
        list.remove(3);

        System.out.println(list);

        // taking input in dynamic array
        for(int i = 0; i < 3; i++)
        {
            list.add(in.nextInt());
        }

        // get item at any index
        System.out.println(list.get(2));

        System.out.println(list);

    }
}
