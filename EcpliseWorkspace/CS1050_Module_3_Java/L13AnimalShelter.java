import java.util.Scanner;
public class L13AnimalShelter
{
//main method start
	public static void main(String[] args)
	{
		//initialized input object
		Scanner input = new Scanner(System.in);
		
		// runs summary display/query
		summarydisplay(input);
		//end of program summary
		System.out.println(" ");
		
		//calls for animalamountentry
		int numberAnimals = animalAmountEntry(input);
		//end 
	
		//initializes animalNames array and calls animal entry method while passing input and the array
		String animalNames [] = new String [numberAnimals];
		animalNameEntry(input, animalNames);
		//end
		
		//initalizes animalweights array and calls animalweight entry method
		double animalWeights [] = new double[numberAnimals];
		animalweightentry(input, animalWeights);
		//end 
		
		//initializes daily food amounts array and calls food entry method
		double dailyFoodAmounts [] = new double [numberAnimals];	
		animalDailyFoodEntry(dailyFoodAmounts, input);
		//end

		//initalizes weeeklyfood array and calls weeklyfood calculation method
		double individualWeeklyFood[] = new double [numberAnimals];
		individualAnimalWeeklyFood(dailyFoodAmounts, individualWeeklyFood);
		//end

		//initalizes weight category array and calls weight class method
		String animalWeightCategory [] = new String [numberAnimals];
		weightClass(animalWeightCategory, animalWeights, input);
		//end

		//calls animal info method
		animalInfoPrint(animalNames, animalWeights, animalWeightCategory, dailyFoodAmounts, individualWeeklyFood);
		//end

		//calls totalweeklyfood display method
		totalWeeklyFood(individualWeeklyFood);
		//end
		
		//calls daily food average calc method
		double dailyFoodAverage = averageDailyFood(dailyFoodAmounts);
		//end
	
		//calls display above average method
		displayAboveAverage(animalNames, dailyFoodAmounts, dailyFoodAverage);
		//end
		
		input.close();
	}
//main method end 
	
	//display above average method
	public static void displayAboveAverage(String animalNames[], double dailyFoodAmounts[], double dailyFoodAverage)
	{
		for(int index = 0; index < animalNames.length; index++)
		{
			if (dailyFoodAmounts[index] >= dailyFoodAverage)
					{
				System.out.println(animalNames[index]);
					}
		}
	}
	//end

	//average daily food method
	public static double averageDailyFood(double dailyFoodAmounts [])
	{
		double total = 0;
		for (int index = 0; index < dailyFoodAmounts.length; index++)
		{
			total = total + dailyFoodAmounts[index];
		}
		double average = total / dailyFoodAmounts.length;
		System.out.println("the average daily Food is " + average + " cups");
		return average;
		
	}
	//end

	//weekly food method
	public static void totalWeeklyFood(double weeklyFood[])
	{
		double total = 0;
		for(int index = 0; index < weeklyFood.length; index++)
		{
			total += weeklyFood[index];
		}
		System.out.print("The total weekly food is " + total + " cups");
	}
	//end

	//animal info print method
	public static void animalInfoPrint(String animalNames[], double animalWeights[], String animalWeightCategory[], double dailyFoodAmounts[], double individualWeeklyFood[])
	{
		for( int index = 0; index < animalNames.length; index++)
		{
			System.out.println(animalNames[index]);
			System.out.println(animalWeights[index]);
			System.out.println(animalWeightCategory[index]);
			System.out.println(dailyFoodAmounts[index]);
			System.out.println(individualWeeklyFood[index]);
			
		}
		
	}
	//end

	//summary display method
	public static void summarydisplay(Scanner input)
	{
	System.out.println("Would you like to see a summary of the program? (yes/no)");
	String summarydecision = input.nextLine();
	
	boolean correctDecision = false;
	if (summarydecision.equals("yes") || summarydecision.equals("no"))
	{
		correctDecision = true;
	}
	while (correctDecision == false)
	{
		System.out.println("Please enter Yes or no");
		summarydecision = input.nextLine();
		if (summarydecision.equals ("yes") || summarydecision.equals ("no"))
{
	correctDecision = true;
}
	}
		if (summarydecision.equals("yes"))
		{
			System.out.println("");
			System.out.println("Animal Rescue Analysis Summary:");
			System.out.println("");
			System.out.println("this program will ask you the name, weight, and daily food amount for the amount of animals");
			System.out.println("Then the program will analyze the information inputed and will calculate each animals weekly food amount,"
					+ " catgorize animal by weight, calculate the ");
					 System.out.println("average daily food amount, and display any animals who eat as much or more than the average daily");
					 
		}
		else
		{
			
		}
		
	}
	//end of summary display method
	
	//name entry method
	public static void animalNameEntry(Scanner input, String currentAnimalNames[])
	{
		
		for (int index = 0; index < currentAnimalNames.length; index++)
		{
		int printIndex = index + 1;
		System.out.println("");
		System.out.println("please enter Animal "  + printIndex + "'s name ");
		currentAnimalNames[index] = input.nextLine();
		}
		
		System.out.print("");
	}
	//end animal entry method
	
	//animal weight entry method
	public static void animalweightentry(Scanner input, double currentAnimalWeights[])
	{
		for (int index = 0; index < currentAnimalWeights.length; index++)
		{
			int printIndex = index + 1;
		System.out.println("");
		System.out.println("please enter Animal " + printIndex + "'s weight(pounds): ");
		double checkInput = input.nextDouble();
		checkInput = checkValidDouble(checkInput, input);
		currentAnimalWeights[index] = checkInput;
		}
	}
	//end of weight entry method
	
	
	//start of daily food entry method
	public static void animalDailyFoodEntry(double currentDailyFoodAmount[], Scanner input)
	{
		for (int index = 0; index < currentDailyFoodAmount.length; index++)
		{
		int printIndex = index + 1;
		System.out.println("");
		System.out.println("please enter Animal "  + printIndex + "'s daily food amount ");
		double checkValue = input.nextDouble();
		checkValue = checkValidDouble(checkValue, input);
		currentDailyFoodAmount[index] = checkValue;
		
		}
		
		
		
	}
	//end of food entry method
	
	
	//weekly food calculation method
	public static void individualAnimalWeeklyFood(double currentDailyFoodAmounts[], double WeeklyFood[])
	{
		
		for (int index = 0; index < currentDailyFoodAmounts.length; index++)
			{
			WeeklyFood[index] = currentDailyFoodAmounts[index] * 7;
			}
		
	}
	//end of week food calc method
	
	//weight class method
	public static void weightClass(String animalWeightCategory [], double animalWeights [], Scanner input)
	{
		for (int index = 0; index < animalWeights.length; index++ )
		{
		if (animalWeights[index] < 20.00)
		{
			animalWeightCategory[index] = ("small");
		}
		else if (animalWeights[index] >= 20 && animalWeights[index] < 50)
		{
			animalWeightCategory[index] = ("medium");
		}
		else if (animalWeights[index] >= 50 && animalWeights[index] < 100)
		{
			animalWeightCategory[index] = ("large");
		}
		else 
		{
			animalWeightCategory[index] = ("Extra Large");
		}
	}
	}
//end

//check double method
public static double checkValidDouble(double checkVariable, Scanner input)
{
	boolean validInput;
	if (checkVariable > 0)
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
		
		if (checkVariable <= 0)
		{
			
		}
		else 
		{
			validInput = true;
		}
	}
	return checkVariable;
}
//end

//check integer method
public static int checkvalidInteger(int checkVariable, Scanner input)
{
	boolean validInput;
	if (checkVariable > 0)
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
		
		if (checkVariable <= 0)
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
	numberAnimals = checkvalidInteger(numberAnimals, input);
	input.nextLine();
	return numberAnimals;
}
//end
}
//end of class
