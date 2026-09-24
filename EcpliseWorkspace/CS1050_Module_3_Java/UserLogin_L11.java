import java.util.Scanner;
public class UserLogin_L11
{

	//the first scenario (true, true) works and displays succesful, it is able to detect an incorrect response but
	//it does not know how to break the loop if the username/password is correct. the rest should work if this is fixed.
	//i think it is just a bad loop that doesnt actually break out of every loop.
	
	
		public static void main(String[] args) {

	boolean loginsuccess = false;


	int incorrect = 0;
	Scanner input = new Scanner(System.in);
	String correctusername = ("ABC");
		String correctpassword = ("123");
		System.out.print("enter your username here: ");
	String userentry = input.next();
	System.out.print("enter your Password here: ");
	String passentry = input.next();

	if (userentry.equals(correctusername) && (passentry.equals(correctpassword)))
			{
		loginsuccess = true;
			}

	//start of check loop
	while (loginsuccess == false)
	{

		if (!userentry.equals(correctusername))
		{
			System.out.println("that is incorrect");
			System.out.println("please enter correct username: ");
			userentry = input.next();
		}
		else if (!passentry.equals(correctpassword))
		{
			System.out.println("your password is incorrect");
			System.out.println("please enter correct password: ");
			passentry = input.nextLine();
		}
		else
		{
			loginsuccess = true;
		}
		{
		
			
		}
	loginsuccess = true;

	}

	System.out.print("User Login Succesful, Welcome Back!");
		
		
		input.close();

		}

	}

