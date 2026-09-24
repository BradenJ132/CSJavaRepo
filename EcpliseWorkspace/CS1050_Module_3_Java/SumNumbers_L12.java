import java.util.Scanner;
public class SumNumbers_L12
{
	// this is a comment for my own understanding. so when i declare a variable, i want to call a method, 
	// and the max in this case is the information i am giving the method coming main. and the thing that total
	// in main will actually hold is the total that is given from the method. 2 differnt variables one only
	//existing in the sumnumber method but total in main method holds whatever the method returns
	// so the method wouldnt do anything if it returned nothing orr it did not have a variable holding the return.
	public static void main(String[] args)
	{
		//prompts user for a max number
		System.out.print("please enter a positive max number: ");
		//this creates max as the user input 
		Scanner input = new Scanner(System.in);
		int max = input.nextInt(); 	
		// this calls the method sumnumber, gives it the value of max, and stores it in a variable called total
		int total = sumNumber(max);
		System.out.print("the total is " + total);	
	
	input.close();
	
	}
		
	//this is a method that does summation, i thought it was factorial initialy but that is differnt(multply every
	//number below it)
	//this creates the method (sumnumber)
	public static int sumNumber(int max) {
		//itializes the total variable that is only held within sumnumber
		int total = 0;	
		// this for loop states for max, until max is = to 0, decrement max.
			for (; max != 0 ; max --) {
			//this simply means to make the new total, the total + the max(affected by the decrement)
				total = total + max;
			}
			
			return total;
		}
		


} 	
