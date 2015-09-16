import java.util.Scanner;

public class Task2
{
    public static void main()
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Please enter year: ");
       
       if (in.hasNextInt())
       {
           int year = in.nextInt();
           
           if(year<1582 && year%4==0) System.out.println("Leap year");
           else if (year >=1582 && year%4==0 && (year%100!=0 || year%400==0)) System.out.println("Leap year");
           else System.out.println("Not leap year");
       
        }else System.out.println("Not valid input"); 
    }
}
