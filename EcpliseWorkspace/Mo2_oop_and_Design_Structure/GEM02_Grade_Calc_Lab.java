import java.util.Scanner;
public class GEM02_Grade_Calc_Lab {

	public static void main(String[] args) {
	
		//requests first and last name then stores it as a variable 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your First and last name: ");
		String fullname = input.nextLine();
		
		//requests class participation grade then stores it as a variable 
		System.out.print("Enter your class participation grade: ");
		double gradeclassparticipation = input.nextDouble();
		
		//requests guided exploration grade then stores it as a variable
		System.out.print("Enter your guided explorations grade: ");
		double gradeguidedexplorations = input.nextDouble();
		
		//requests quizzes grade then stores it as a variable
		System.out.print("Enter your quizzes grade: ");
		double gradequizzes = input.nextDouble();

		//requests projects grade then stores it as a variable
		System.out.print("Enter your projects Grade: ");
		double gradeprojects = input.nextDouble();
		
		//requests final demonstration grade then stores it as a variable
		System.out.print("Enter your final demonstation grade: ");
		double gradefinaldemonstration = input.nextDouble();
		
		//defining all weights as constants 
		final double WEIGHT_CLASS_PARTICIPATION = 15;
		final double WEIGHT_GUIDED_EXPLORATIONS = 20;
		final double WEIGHT_QUIZZES = 25;
		final double WEIGHT_PROJECTS = 20;
		final double WEIGHT_FINAL_DEMONSTRATION = 20;
		
		//multiplying weights and grades to create a variable named percentageweight
		double percentageweightclassparticipation = gradeclassparticipation * WEIGHT_CLASS_PARTICIPATION;
		double percentageweightguidedexploration = gradeguidedexplorations * WEIGHT_GUIDED_EXPLORATIONS;
		double percentageweightquizzes = gradequizzes * WEIGHT_QUIZZES;
		double percentageweightprojects = gradeprojects * WEIGHT_PROJECTS;
		double percentageweightfinaldemonstration = gradefinaldemonstration * WEIGHT_FINAL_DEMONSTRATION;
		
		// adds all of the weights together 
		double totalweight =  WEIGHT_CLASS_PARTICIPATION + WEIGHT_GUIDED_EXPLORATIONS + WEIGHT_QUIZZES + WEIGHT_PROJECTS + WEIGHT_FINAL_DEMONSTRATION;
		
		
		// this adds all of the percentage weights together into another variable named total percentage weight 
		double totalpercentageweight = percentageweightclassparticipation + percentageweightguidedexploration + percentageweightquizzes + percentageweightprojects +  percentageweightfinaldemonstration;
	
		// this divides the total percentage weight by the total weight to give the final grade 
		double finalgrade = totalpercentageweight / totalweight;
		
		System.out.print(fullname + ", your final grade is " + finalgrade);
		
			
		//the code until input close is a multiway if/else statement that determines the letter grade based on the calculated final grade
			if (finalgrade >= 90.00)
				{
			 System.out.print(" that's an A");
			}
		
			else if (finalgrade >= 80.00)
			{
				System.out.print(" that's a B");
			}
			
			else if (finalgrade >= 70.00)
			{
				System.out.print(" that's a C");
			}
			
			else if (finalgrade >= 60.00)
			{
				System.out.print(" that's a D");
			}
			
			else 
			{
				System.out.print(" that's a F");
			}
			
			//closes input for Scanner
			input.close();
	}

}
