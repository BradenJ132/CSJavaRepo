import java.util.Scanner;
public class GEM02_Grade_Calc_Lab {

	public static void main(String[] args) {
	
		//requests first and last name then stores it as a variable 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your First and last name: ");
		String fullname = input.nextLine();
		
		//requests class participation grade then stores it as a variable 
		System.out.print("Enter your class participation grade: ");
		double gradeclassparticipaion = input.nextDouble();
		
		System.out.print("Enter your guided explorations grade: ");
		double gradeguidedexplorations = input.nextDouble();
		
		System.out.print("Enter your quizzes grade: ");
		double gradequizzes = input.nextDouble();

		System.out.print("Enter your projects Grade: ");
		double gradeprojects = input.nextDouble();
		
		System.out.print("Enter your final demonstation grade: ");
		double gradefinaldemonstration = input.nextDouble();
			
		
		final double WEIGHT_CLASS_PARTICIPATION = 15;
		final double WEIGHT_GUIDED_EXPLORATIONS = 20;
		final double WEIGHT_QUIZZES = 25;
		final double WEIGHT_PROJECTS= 20;
		final double WEIGHT_FINAL_DEMONSTRATION = 20;
		
		
input.close();
	}

}
