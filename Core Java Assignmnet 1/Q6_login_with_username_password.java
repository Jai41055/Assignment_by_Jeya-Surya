import java.util.Scanner;
public class Q6_login_with_username_password {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
        for (int no_of_Attempts = 1; no_of_Attempts <=3; no_of_Attempts++) 
        {
            System.out.print("Enter Username: ");
            String user = input.nextLine();

            System.out.print("Enter Password: ");
            String pass = input.nextLine();

            if (user.equals("surya") && pass.equals("1234su")) 
            {
                System.out.println("Welcome " + user);
                break;
            } 
            else
            {
                System.out.println("incorrect user id or password \n Remaining attempts "+ (3-no_of_Attempts));
                if(no_of_Attempts == 3)
                {
                    System.out.println("Contact Admin");
                }
            }
        }
        input.close();
		
        }
		
	

}
