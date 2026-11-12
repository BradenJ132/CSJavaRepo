import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class TestCarDealership
{
//start main


	public static void main(String[] args)
	{
		displayProgramSummary();
		String fileName = "cars1.txt";
		try
		{
			System.out.println("\nTesting file: " + fileName);
			Dealership dealership = new Dealership("CS Dealership", 6);
			dealershipSetUp(fileName, dealership);
			dealership.displayCars();
			System.out.println("\nMost Expensive Car:");
			dealership.displayMostExpensiveCar();
			String outputFileName = dealership.getDealershipName() + ".txt";
			dealership.writeCarsToFile(outputFileName);
		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}
		System.out.println("\nEnd of program");
	}
	public static void dealershipSetUp(String fileName, Dealership newDealership) throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileScanner = new Scanner(inputFile);
		while (fileScanner.hasNext())
		{
			String make = fileScanner.next();
			String model = fileScanner.next();
			double price = fileScanner.nextDouble();
			Car car = new Car(make, model, price);
			newDealership.addCar(car);
		}
		fileScanner.close();
	}
	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Dealership and Car Analysis");
		System.out.println("**************************************");
		System.out.println("Reads car data from a file");
		System.out.println("Displays all cars");
		System.out.println("Finds most expensive car");
		System.out.println();


	}
//end main
	
}

class Car
//start Car Class
{
	
	private String carMake;
	private String carModel;
	private double carPrice;
	public Car(String carMake, String carModel, double carPrice)
	{
		this.carMake = carMake;
		this.carModel = carModel;
		this.carPrice = carPrice;
		
		
		
	}
	//getter for car make
	public String getCarMake()
	{
		return carMake;
	}
	//getter for car model
	public String getCarModel()
	{
		return carModel;
	}
	//getter for car price 
	public double getCarPrice()
	{
		return carPrice;
	}
	
	public void displayCarDetails()
	{
		System.out.println(getCarMake() + " " + getCarModel() + " " + getCarPrice());
	}
	
}
//end Car Class



class Dealership
//Start Dealership Class
{
	private String name;
	private int currentNumberCars;
	private Car cars[];
	
	
	public Dealership(String dealershipName, int maxNumberCars)
	{
		this.name = dealershipName;
		cars = new Car[maxNumberCars];
		
	}
	
	public String getDealershipName()

	{
		return name;
	}
	
	public void addCar(Car newCar)
	{
		if (currentNumberCars < cars.length)
		{
			cars[currentNumberCars] = newCar;
			currentNumberCars++;
		}
		else
		{
			System.out.println("ERROR - Maximum capcity reached");
		}
	}
	
	public void displayMostExpensiveCar()
	{
		Car mostExpensive = cars[0];
		for(int index = 0; index < currentNumberCars; index++)
		{
			if (cars[index].getCarPrice() > mostExpensive.getCarPrice())
			{
				 mostExpensive = cars[index];
			}
		}
			mostExpensive.displayCarDetails();
			
			
		
	}
	
	public void displayCars()
	{
		for(int index = 0; index < currentNumberCars; index++)
		{
			
			cars[index].displayCarDetails();
		}
		
	}
	
	public void writeCarsToFile(String fileName)
	{
		
	}	
	
}
//End Dealership Class

