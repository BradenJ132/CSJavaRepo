import java.util.Scanner;
public class L13AnimalShelter
{
//main method start
	public static void main(String[] args)
	{
		//initialized input object
		Scanner input = new Scanner(System.in);
		
		// runs summary displayer/query
		System.out.print("Would you like to see a summary of the program? (yes/no)");
		String summarydecision = input.nextLine();
		summarydisplay(summarydecision);
		//calls animal name weight and food.
		String animalname = animalnameentry(input);
		double animalweight = animalweightentry(input);
		double dailyfoodentry = animaldailyfoodentry(input);
		//checks for correct info
		double weeklyfood = animalweeklyfood(dailyfoodentry);
		String classification = weightclass(animalweight);
		System.out.println("");
		System.out.println("the animal's name is " + animalname);
		System.out.println( animalname + " weighs " + animalweight + " pounds");
		System.out.println(animalname + " is classfied as " + classification + " sized");
		System.out.println(animalname + " gets " + dailyfoodentry + " cups of food daily");
		System.out.println(animalname + " should be getting " + weeklyfood + " cups of food weekly");
input.close();
	
	
	}
//main method end 
	
	//summary display method
	public static void summarydisplay(String currentsummarydecision)
	{
		if (currentsummarydecision.equals("yes"))
		{
			System.out.println("");
			System.out.println("Animal Rescue Analysis Summary:");
			System.out.println("");
			System.out.println("this program will ask you the name, weight, and daily food amount for each animal");
			System.out.println("Then the program will analyze the information inputed and will calculate each animals weekly food amount and catgorize animal by weight");
		}
		else
		{
			
		}
		
	}
	//end of summary display method
	
	//name entry method
	public static String animalnameentry(Scanner input)
	{
		
		System.out.println("");
		System.out.println("please enter Animal's name: ");
		String currentanimalname = input.nextLine();
		
		return currentanimalname;
		
	}
	//end animal entry method
	
	//animal weight entry method
	public static double animalweightentry(Scanner input)
	{
		
		System.out.println("");
		System.out.println("please enter Animal's weight(pounds): ");
		double currentweight = input.nextDouble();
		while (currentweight < 1)
		{
			System.out.println("invalid entry");
			System.out.println("please enter Animal's weight(pounds): ");
			currentweight = input.nextDouble();
		}
		
		return currentweight;
	}
	//end of weight entry method
	//start of daily food entry method
	public static double animaldailyfoodentry(Scanner input)
	{
		
		System.out.print("");
		System.out.println("please enter Animal's daily food amount(cups): ");
		double currentfoodentry = input.nextDouble();
		while (currentfoodentry < 1)
		{
			System.out.println("invalid entry");
			System.out.println("please enter Animal's daily fod amount(cups): ");
			currentfoodentry = input.nextDouble();
		}
		
		return currentfoodentry;
	}
	//end of food entry method
	//weekly food calculation method
	public static double animalweeklyfood(double dailyfoodentry)
	{
		double weeklyfood = dailyfoodentry * 7; 
		return weeklyfood;
	}
	//end of week food calc method
	
	public static String weightclass(double animalweight)
	{
	String classification = ("");
		if (animalweight < 20.00)
		{
			classification = ("small");
		}
		else if (animalweight >= 20 && animalweight < 50)
		{
			classification = ("medium");
		}
		else if (animalweight >= 50 && animalweight < 100)
		{
			classification = ("large");
		}
		else 
		{
			classification = ("Extra Large");
		}
		return classification;
	}
}
