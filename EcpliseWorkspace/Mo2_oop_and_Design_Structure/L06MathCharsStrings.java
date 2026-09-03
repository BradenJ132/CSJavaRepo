
import java.util.Scanner;
public class L06MathCharsStrings {

	public static void main(String[] args) {
		double randomDouble = Math.random();
		int randomInt = (int) Math.random();
		randomInt = (int) (Math.random() * 10);
		randomInt = (int) (Math.random() * 10 + 1);
		
		Scanner input = new Scanner(System.in)
		String firstname = input.next();
		char firstinitial = firstname.charAt(0);
		
		char middleInitial = 'm';
		int charAsciiValue = (int)middleInitial;
		
		String firstname = ("Braden");
		int stringlength = firstname.length();
		char firstinitial = firstname.charAt(0);
		char lastletter = firstname.charAt(stringlength - 1);
		
		

}
