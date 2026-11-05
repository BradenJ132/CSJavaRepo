
public class TestCarDealership
{
//start main


	public static void main(String[] args)
	{
		Dealership jerrys = new Dealership("jerrys", 3);
		
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
	
	public String getCarMake()
	{
		return carMake;
	}
	
	public String getCarModel()
	{
		return carModel;
	}
	
	public double getCarPrice()
	{
		return carPrice;
	}
}
//end Car Class



class Dealership
//Start Dealership Class
{
	private String dealershipName;
	private int maxLotCapacity;
	private int numberOfCars;
	private Car cars[] = new Car[numberOfCars];
	
	public Dealership(String dealershipName, int numberOfCars)
	{
		this.dealershipName = dealershipName;
		this.numberOfCars = numberOfCars;
	}
}
//End Dealership Class

