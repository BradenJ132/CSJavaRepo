import java.util.Scanner;
public class UserLogin_L11
{

	//the first scenario (true, true) works and displays succesful, it is able to detect an incorrect response but
	//it does not know how to break the loop if the username/password is correct. the rest should work if this is fixed.
	//i think it is just a bad loop that doesnt actually break out of every loop.
	
	
		public static void main(String[] args) {

	boolean loginsuccess = false;

// initializes incorrect counter 
	int incorrect = 0;
	Scanner input = new Scanner(System.in);
	String correctusername = ("ABC");
		String correctpassword = ("123");
		
		// prompts user for username and password and stores the response as a string in userentry and passentry
		System.out.print("enter your username here: ");
	String userentry = input.next();
	System.out.print("enter your Password here: ");
	String passentry = input.next();
// this is an itial check for immidiate login, if they are both true the first time then it never enters the while loop
	//if they are not both true it counts as one attempt
	if (userentry.equals(correctusername) && (passentry.equals(correctpassword)))
			{
		loginsuccess = true;
			}
	else {
		incorrect ++;
	}

	//start of check loop
	// this is a boolean flag, i have set it so when both the username and password are corerct it will set it to 
	//true and therfore break the loop
	//this is how i did my max login attempts counter, i used the variable incorrect, and incremented it whenever
	//a failed attempt occured.
	while (loginsuccess == false && incorrect < 3)
	{
//this checks for correct username, if not then it increments the attempt counter and asks for another input
		if (!userentry.equals(correctusername))
		{
			incorrect ++;
			System.out.println("that is incorrect");
			System.out.println("please enter correct username: ");
			userentry = input.next();
		}
	//this checks the password and increments if its wrong(if entered password does not equal corerct password)
		else if (!passentry.equals(correctpassword))
		{
			incorrect ++;
			System.out.println("your password is incorrect");
			System.out.println("please enter correct password: ");
			passentry = input.next();
		}
		else
		{
			//this will break the loop by setting the bolean flag to true if the user makes it through both if statements
			loginsuccess = true;
		}
		{
		
			
		}

	}
// this is the last check after exiting the loop, if the counter hit three before breaking then it displayer login unsuccesful
	//otherwize it states succesful login
	if (loginsuccess == true) {
	System.out.print("User Login Succesful, Welcome Back!");
	}
	else 
	{
	 System.out.print("login unsuccesful please try again later");
	}
		//closes Scanner input 
		input.close();

		}

	}

