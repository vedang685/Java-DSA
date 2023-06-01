import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

//        switch (fruit)
//        {
//            case "Mango":
//                System.out.println("king of fruits");
//                break;
//            case "Apple":
//                System.out.println("red fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }

        // enhanced switch

//        switch (fruit)
//        {
//            case "Mango" -> System.out.println("king of fruits");
//            case "Apple" -> System.out.println("red fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }

        // NESTED SWITCH STATEMENT

        int empID = in.nextInt();
        String department = in.next();

        switch(empID)
        {
            case 1:
                System.out.println("VEDANG");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Employee 3");
                switch (department)
                {
                    case "IT":
                        System.out.println("IT DEPARTMENT");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("Enter department correctly");
                }
                break;
            default:
                System.out.println("please enter empID correctly");

        }


    }
}
