
public class TestCarDealership
{
//start main


	public static void main(String[] args)
	{
		Dealership jerrys = new Dealership("jerrys", 3);
		Car car1 = new Car("subaru", "impreza", 2000);
		Dealership.addCar(car1);
		
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
	
	public void addCar(Car newcar)
	{
		if (currentNumberCars < cars.length)
		{
			cars[currentNumberCars] = newcar;
		}
		else
		{
			System.out.println("ERROR - Maximum capcity reached");
		}
	}
	
	public void displayMostExpensive()
	{
		
	}
	
	public void displayCars()
	{
		
	}
	
	public void writeCarsToFile()
	{
		
	}
}
//End Dealership Class

