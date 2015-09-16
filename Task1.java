import java.util.Scanner;

public class Task1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        
        if (in.hasNextInt())
        {
            int number = in.nextInt();
            
            if (number>0) System.out.print("Positive");
            else if (number==0) System.out.println("Zero");
            else System.out.println("Negative");
        }else
        {
            System.out.println("Not integer.");
        }
        
        
    }
}
