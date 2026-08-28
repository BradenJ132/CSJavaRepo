/**
 * 
 */

/**
 * 
 */

public class GEGradeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final double Weight_Class_Participation = 15;
		final double Weight_Guided_Explorations = 20;
		final double Weight_Quizzes = 25;
		final double Weight_Projects = 20;
		final double Weight_Final_Demonstation = 20;
		
		double gradeclassparticipation = 74;
		double gradeguidedexploration = 85.3;
		double gradequizzes = 91.25;
		double gradeprojects = 72.3;
		double finaldemonstation = 91.74;
	
		double Percentageweightclassparticipation = gradeclassparticipation * Weight_Class_Participation;
		double Percentageweightguidedexploration = gradeguidedexploration * Weight_Guided_Explorations;
		double Percentageweightquizzes = gradequizzes * Weight_Quizzes;
		double Percentageweightprojects = gradeprojects * Weight_Projects;
		double Percentageweightfinaldemonstration = finaldemonstation * Weight_Final_Demonstation;
		
		double totalweight = Weight_Class_Participation * Weight_Guided_Explorations * Weight_Quizzes * Weight_Projects * Weight_Final_Demonstation;
 
	 System.out.print(totalweight);
	}

}
