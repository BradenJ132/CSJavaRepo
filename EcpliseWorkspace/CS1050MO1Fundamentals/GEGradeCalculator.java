/**
 * 
 */

/**
 * 
 */



	//Braden Jones
	//CS1050 
	//GEMO1
	//this program calculates a final grade for this class based on the category weights.



	public class GEGradeCalculator {
	public static void main(String[] args) {
	
		//this defines each weight as a constant 
	
	final double Weight_Class_Participation = 15;
		final double Weight_Guided_Explorations = 20;
		final double Weight_Quizzes = 25;
		final double Weight_Projects = 20;
		final double Weight_Final_Demonstation = 20;
		
		//this is defining all of the grades as variables
		double gradeclassparticipation = 79;
		double gradeguidedexploration = 85.3;
		double gradequizzes = 91.25;
		double gradeprojects = 72.325;
		double gradefinaldemonstation = 91.74;

		//this is multiplying the grades and weights to create another variable which is named the percentage weight.
		double Percentageweightclassparticipation = gradeclassparticipation * Weight_Class_Participation;
		double Percentageweightguidedexploration = gradeguidedexploration * Weight_Guided_Explorations;
		double Percentageweightquizzes = gradequizzes * Weight_Quizzes;
		double Percentageweightprojects = gradeprojects * Weight_Projects;
		double Percentageweightfinaldemonstration = gradefinaldemonstation * Weight_Final_Demonstation;
		
		// this adds all of the weights together 
		double totalweight = Weight_Class_Participation + Weight_Guided_Explorations + Weight_Quizzes + Weight_Projects + Weight_Final_Demonstation;
		
		// this adds all of the percentage weights together into another variable named total percentage weight 
		double totalpercentageweight = Percentageweightclassparticipation + Percentageweightguidedexploration + Percentageweightquizzes + Percentageweightprojects +  Percentageweightfinaldemonstration;
	// this divides the total percentage weight by the total weight to give the final grade 
		double finalgrade = totalpercentageweight / totalweight;
		
		//these are all printing out the weights for each category Ex: Class Participation weight: 15.0
		System.out.println("Class Participation Weight: " + Weight_Class_Participation);
		System.out.println("Guided Exploration Weight: " + Weight_Guided_Explorations);
		System.out.println("Quizzes Weight: " + Weight_Quizzes);
		System.out.println("Projects Weight: " + Weight_Projects);
		System.out.println("Final Demonstation Weight: " + Weight_Final_Demonstation);
		
		// this is to create a space between the weights and percentage grades 
		System.out.println("");
		
		//these are printing out the percentage grades entered
		System.out.println("Class Participation Grade: " + gradeclassparticipation);
		System.out.println("Guided Exploration Grade: " +  gradeguidedexploration);
		System.out.println("Quizzes Grade: " + gradequizzes);
		System.out.println("Projects Grade: " + gradeprojects);
		System.out.println("Final Demonstation Grade: " + gradefinaldemonstation);
		
		// this is simply to create space between the category weights and the final grade
		System.out.println("");
		
		// this prints out the final grade after all of the calculations and says final grade: (final grade)
		System.out.println("Final Grade: " +  finalgrade); 
	
	}

}
