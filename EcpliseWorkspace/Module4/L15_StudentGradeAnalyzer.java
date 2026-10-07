import java.util.Scanner;
public class L15_StudentGradeAnalyzer
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of Students: ");
		int numberOfStudents = input.nextInt();
		String  firstNames[] = new String [numberOfStudents];
		double finalGrades [] = new double [numberOfStudents];
		
		System.out.println("firstNames: " + firstNames);
		System.out.println("finalGrades: " + finalGrades);
input.close();
	}

}
