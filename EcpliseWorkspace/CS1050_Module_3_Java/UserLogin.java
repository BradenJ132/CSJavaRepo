



//the first scenario (true, true) works and displays succesful, it is able to detect an incorrect response but
//it does not know how to break the loop if the username/password is correct. the rest should work if this is fixed.
//i think it is just a bad loop that doesnt actually break out of every loop.
import java.util.Scanner;
public class UserLogin
{
	public static void main(String[] args) {

boolean usernamesuccess = false;
boolean passwordsuccess = false;

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
	usernamesuccess = true;
	passwordsuccess = true;
		}

//start of check loop
while (usernamesuccess == false || passwordsuccess == false)
	
{
	
	while (!userentry.equals(correctusername))
	{
	incorrect = incorrect ++;
	System.out.println("that is incorrect");
	System.out.println("enter your username here: ");
	userentry = input.next();
	}

	usernamesuccess = true;
	
	while (!passentry.equals(correctpassword))
	{
		
		incorrect = incorrect ++;
		System.out.println("that is incorrect");
		System.out.println("enter your password here: ");
		passentry = input.next();
	
	}

	passwordsuccess = false;
}

System.out.print("User Login Succesful, Welcome Back!");

	
	int number = 0;
	System.out.print(++ number);
	
	
	input.close();

	}

}
