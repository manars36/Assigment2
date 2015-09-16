import java.util.Scanner;

public class Task4
{
   public static void main()
   {
       final int CODE = 1234;
       Scanner in = new Scanner(System.in);
       
       int pin;
       System.out.println("Please enter your PIN: ");
       
       pin = in.nextInt();
           
       if(pin == CODE)
       {
           System.out.println("Your PIN is correct");
       }
       else 
       {
          System.out.println("Your PIN is incorrect");
          
          System.out.println("Please enter your PIN: ");
          pin = in.nextInt();
          if(pin == CODE) System.out.println("Your PIN is correct");
          else
          {
              System.out.println("Please enter your PIN: ");
              pin = in.nextInt();
              if(pin == CODE) System.out.println("Your PIN is correct");
              else System.out.println("Your bank card is blocked");
          }
        }
   }
}
