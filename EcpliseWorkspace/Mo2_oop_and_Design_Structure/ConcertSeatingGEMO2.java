import java.util.Scanner;
public class ConcertSeatingGEMO2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
System.out.print("please Enter your Section Character: ");
char sectioncharacter = input.next().charAt(0);
sectioncharacter = Character.toUpperCase(sectioncharacter);
	
		
while (sectioncharacter != ('F') && sectioncharacter != ('C') && sectioncharacter != ('S') && sectioncharacter != ('U'))
			{
				 System.out.print("please enter a valid Section: ");
				sectioncharacter = input.next().charAt(0);
				sectioncharacter = Character.toUpperCase(sectioncharacter);
				}
	
	if (sectioncharacter == ('F'))
			{
		System.out.println("You are in section Foxtrot(f)");
			}
			
	else if (sectioncharacter == ('C'))
	{
System.out.println("You are in section Charlie(C)");
	}	
	
	
	else if (sectioncharacter == ('S'))
	{
System.out.println("You are in section Sierra(S)");
	}
	
	else 
	{
System.out.println("You are in section Uniform(U)");
	}
	
	System.out.println("Please enter your Row number: " );
	int rownumber = input.nextInt();
	while (rownumber > (60) || rownumber < (1))
	{
		System.out.println("please enter a valid Row Number: " );
		rownumber = input.nextInt();
	}
	
	if (rownumber >= 1 && rownumber <= 15)
	{
		System.out.println("your ticket costs $450");
	}
	
	else if (rownumber > 15 && rownumber <= 30)
	{
		System.out.println("your ticket costs $300");
	}
	else 
	{
		System.out.println("your ticket costs $200");
	}
	
	System.out.println("your seat is located at "+ sectioncharacter + rownumber); 	
	input.close();
	
	}

}
