import java.util.Scanner;

public class Task5
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter five-digit integer");
        
        int number = in.nextInt();
        
        int div=10000, i = 1;
        boolean ifFriendly = true;
        
        while(div>0)
        {
            if((number/div)%i!=0)
            {
                ifFriendly = false;
                break;
            }
            i++;
            div = div/10;
        }
        if (ifFriendly == true) System.out.println("Given number is friendly");
          else System.out.println("Given number isn't friendly");
    }
}
