import java.util.Scanner;
public class L15_StudentGradeAnalyzer
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of Students: ");
		int numberStudents = input.nextInt();
		String  firstNames[] = new String [numberStudents];
		//declares array finalGrades
		double finalGrades [] = new double [numberStudents];
		nameentry(numberStudents, firstNames, input);
		gradeentry(numberStudents, finalGrades, input);
		printfinal(numberStudents, firstNames, finalGrades);
	input.close();
	
	}

	public static void nameentry( int currentNumberStudents, String firstNames[], Scanner input)
	{
		for (int index = 0; index < currentNumberStudents; index++ )
		{
			int printIndex = index + 1;
			System.out.println("please enter student " + printIndex  + " name");
			firstNames[index] = input.next();
		}
	}
	//this method allows the user to enter input for each student by incrementing the index to shift the element being entered
	public static void gradeentry( int currentNumberStudents, double finalGrades[], Scanner input)
	{
		for (int index = 0; index < currentNumberStudents; index++ )
		{
			int printIndex = index + 1;
			System.out.println("please enter student " + printIndex  + " grade");
			finalGrades[index] = input.nextDouble();
		}
	}
	
	public static void printfinal(int numberStudents, String firstNames[], double finalGrades[])
	{
		for (int index = 0; index < numberStudents; index++)
		{
	System.out.println(firstNames[index] + "'s final grade is " + finalGrades[index] );
	System.out.print("");
		}
	}
}
