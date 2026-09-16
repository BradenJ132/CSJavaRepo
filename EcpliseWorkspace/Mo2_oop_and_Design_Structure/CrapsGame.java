
import java.util.Scanner;
public class CrapsGame
{
	
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	String rollagain = "r";
	
	while (rollagain.equals("r")) {
		//generates random number between 1 and 6 for dice 1 and dice 2 
		int d1 = (int) ((Math.random () * 5 + 1));
			System.out.println(d1);
		int d2 = (int) ((Math.random () * 5 + 1));
		System.out.println(d2);
//this is a nested if else statement, it says if it is doubles then check if its doulbe sixes if not then it is just doubles
	if (d1 + d2 == 7 || d1 + d2 == 11)
	{
	System.out.println("YOU WIN!");
	}

		
	else if (d1 == d2)
	{
	if (d1 == 6 && d2 == 6)
	{
		System.out.println("JACKPOT!!!!");
	}
	else
	{
		System.out.println("DOUBLES! YOU WIN!");
	}
		
	}

else
{
	System.out.println("you lose :{" );
}
	System.out.println("");
System.out.println("Roll Again(r)");

rollagain = input.nextLine();
		
//end of main
	}
	input.close();		

	}

}
