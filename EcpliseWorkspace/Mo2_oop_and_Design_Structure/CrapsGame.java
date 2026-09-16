//imports scanner class
import java.util.Scanner;
public class CrapsGame
{
	
	public static void main(String[] args)
	{
	//sets scanner input	
	Scanner input = new Scanner(System.in);
	//sets inital coin amount
	double coinamount = 80;
	String rollagain = "r";

	while (rollagain.equals("r")) {
		//generates random number between 1 and 6 for dice 1 and dice 2 
		System.out.print("Bet Amount: ");
		double betamount = input.nextDouble();
		coinamount = coinamount - betamount;
		
		int d1 = (int) ((Math.random () * 5 + 1));
			System.out.println(d1);
		int d2 = (int) ((Math.random () * 5 + 1));
		System.out.println(d2);


//this is a nested if else statement, it says if it is doubles then check if its doulbe sixes if not then it is just doubles
	if (d1 + d2 == 7 || d1 + d2 == 11)
	{
	System.out.println("YOU WIN!");
	coinamount = (double) betamount * 2 + coinamount;
	System.out.println("you now have: " + coinamount + " coins");
	

	}

		
	else if (d1 == d2)
	{
	if (d1 == 6 && d2 == 6)
	{
		System.out.println("JACKPOT!!!!");
		coinamount = (double) betamount * 10 + coinamount;
		System.out.println("you now have: " + coinamount + " coins");
		
	}
	else
	{
		System.out.println("DOUBLES! YOU WIN!");
		coinamount = (double) betamount * 3 + coinamount;
		System.out.println("you now have: " + coinamount + " coins");
		
	}
		
	}

else
{
	System.out.println("you lose :{" );
	coinamount = (double) betamount - betamount + coinamount;
	System.out.println("you now have: " + coinamount + " coins");
	
}
	if (coinamount <= 0)
{
	System.out.print("you are poor");
	break;
}
	
	
	System.out.println("");
System.out.println("Roll Again?(r)");

rollagain = input.next();
		
//end of main
	}
	input.close();		

	}

}
