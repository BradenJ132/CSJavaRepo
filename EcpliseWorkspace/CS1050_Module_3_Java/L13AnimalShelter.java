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
		String animalname = animalnameentry();
		double animalweight = animalweightentry();
		double dailyfoodentry = animaldailyfoodentry();
		
		
		
		
		
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
	public static String animalnameentry()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("please enter Animal's name: ");
		String currentanimalname = input.nextLine();
		input.close();
		return currentanimalname;
	}
	//end animal entry method
	
	//animal weight entry method
	public static double animalweightentry()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("please enter Animal's weight: ");
		double currentweight = input.nextDouble();
		input.close();
		
		return currentweight;
	}
	//end of weight entry method
	//start of daily food entry method
	public static double animaldailyfoodentry()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("please enter Animal's daily food amount: ");
		double currentfoodentry = input.nextDouble();
		input.close();
		
		return currentfoodentry;
	}
	//end of food entry method
}
