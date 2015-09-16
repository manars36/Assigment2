import java.util.Scanner;

public class Task3
{
    public static void main()
    {
       //input
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first string: ");
        String word1 = in.nextLine();
        
        System.out.println("Please enter second string: ");
        String word2 = in.nextLine();
        
        System.out.println("Please enter third string: ");
        String word3 = in.nextLine();
       
       if(word1.compareTo(word2) < 0)
       {
           if (word3.compareTo(word1) <0) System.out.println(word3 + " " + word1 + " "+ word2);
           else
           {
               if (word3.compareTo(word2) <0) System.out.println(word1 + " " + word3 + " "+ word2);
               else System.out.println(word1 + " " + word2 + " "+ word3);
           }
        }
        else
        {
            if(word3.compareTo(word2) < 0) System.out.println(word3 + " " + word2 + " "+ word1);
            else
            {
                if(word3.compareTo(word1) <0) System.out.println(word2 + " " + word3 + " "+ word1);
                else System.out.println(word2 + " " + word1 + " "+ word3);
            }
        }
    }
}
