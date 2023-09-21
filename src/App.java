import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int num;
        
        System.out.println("Please enter a number or enter exit :");
        
      
       while (!exit)
       {
        try
        {
        String holder = scan.nextLine();
        if(holder.equalsIgnoreCase("exit"))
            {
                break;
            }
        num = Integer.parseInt(holder);
        factor(num);
        
        
        System.out.println("Value you entered: " + num);
        }
        catch (Exception e)
        {
            System.out.println("Bad input, please try again.");
        }
       }

    }

    public static void factor(int holder)
    {
        for (int i = 1; i <= holder; i++)
        {
            if (holder % i == 0) 
            {
                System.out.println( i + " is a factor of " + holder);
            }
        }
    }
}
