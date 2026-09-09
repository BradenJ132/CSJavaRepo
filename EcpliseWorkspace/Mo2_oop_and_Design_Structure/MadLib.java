
import java.util.Scanner;
public class L06MathCharsStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input your first name: ");
		String firstname = input.nextLine();
		
		System.out.print("input your last name: ");
		String lastname = input.nextLine();
		
		System.out.print("input your pronoun: ");
		String pronoun = input.nextLine();
	
		System.out.print("input a noun: ");
		String noun = input.nextLine();
		
		System.out.print("input a verb(ending in ing): ");
		String verb = input.nextLine();
		
		System.out.print("input an adjective: ");
		String adjective = input.nextLine();
		
		System.out.print("input a place : ");
		String place = input.nextLine();
		
		char lastnameinitial = lastname.charAt(0);
		
		System.out.print("on a lonely night " + firstname  + lastnameinitial  + "was " 
		+  verb + "around " + place + "." + pronoun + "liked" + adjective + noun + "very much"  );
input.close();
	}
}