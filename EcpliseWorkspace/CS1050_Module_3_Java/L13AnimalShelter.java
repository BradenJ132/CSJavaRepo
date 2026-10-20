import java.util.Scanner;
public class L13AnimalShelter
{
//main method start
	public static void main(String[] args)
	{
		//initialized input object
		Scanner input = new Scanner(System.in);
		
		// runs summary displayer/query
		System.out.println("Would you like to see a summary of the program? (yes/no)");
		String summarydecision = input.nextLine();
		summarydisplay(summarydecision);
		//end of program summary
		
		System.out.println(" ");
		
		//calls for animalamountentry
		int numberAnimals = animalAmountEntry(input);
		//end 
	
		//calls animal name 
		String animalNames [] = new String [numberAnimals];
		animalnameentry(input, animalNames);
		//end
		
		input.nextLine();
		//animal weight entry
		double animalweight = animalweightentry(input);
		//end 
			
		double dailyfoodentry = animaldailyfoodentry(input);
		
		double weeklyfood = animalweeklyfood(dailyfoodentry);
		String classification = weightclass(animalweight);
		
input.close();
	
	
	}
//main method end 
	
	//summary display method
	public static void summarydisplay(String currentsummarydecision )
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
	public static void animalnameentry(Scanner input, String currentAnimalNames[])
	{
		
		for (int index = 0; index < currentAnimalNames.length; index++)
		{
		int printIndex = index + 1;
		System.out.println("");
		System.out.println("please enter Animal "  + printIndex + "'s name ");
		currentAnimalNames[index] = input.nextLine();
		}
		
		
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
		if (currentfoodentry < 1)
		{
			checkvalidDouble(currentfoodentry, input);
		}
		else
		{
			
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


public static double checkvalidDouble(double checkVariable, Scanner input)
{
	boolean validInput;
	if (checkVariable >= 1)
	{
		validInput = true;
	}
	else
	{
		validInput = false;
	}
	
	while (validInput == false)
	{
		System.out.print("please enter valid input: ");
		checkVariable = input.nextDouble();
		
		if (checkVariable < 1)
		{
			
		}
		else 
		{
			validInput = true;
		}
	}
	return checkVariable;
}
public static int checkvalidInteger(int checkVariable, Scanner input)
{
	boolean validInput;
	if (checkVariable >= 1)
	{
		validInput = true;
	}
	else
	{
		validInput = false;
	}

	while (validInput == false)
	{
		System.out.print("please enter valid input: ");
		checkVariable = input.nextInt();
		
		if (checkVariable < 1)
		{
			
		}
		else 
		{
			validInput = true;
		}
	}
	return checkVariable;
}
public static int animalAmountEntry(Scanner input)
{
System.out.println("how many animals are in the shelter?");
	int numberAnimals = input.nextInt();
	checkvalidInteger(numberAnimals, input);
	input.nextLine();
	return numberAnimals;


	
}
}
