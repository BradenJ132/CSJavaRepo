import java.util.Scanner;
public class ConcertSeatingGEMO2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
System.out.print("please Enter your Section Character: ");
char sectioncharacter = input.next().charAt(0);
sectioncharacter = Character.toUpperCase(sectioncharacter);
System.out.print(sectioncharacter);
		
		
	}

}
