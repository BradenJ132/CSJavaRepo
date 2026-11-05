
public class TestSimpleCircle
{
	 public static void main(String[] args) {
		    // Create a circle with radius 1
		 SimpleRectangle rectangle[] = new SimpleRectangle[2];
		 SimpleRectangle rect1 = new SimpleRectangle(24, 24);
		  
		 System.out.println(rect1.getLength() + " " +  rect1.getWidth());
		 
		   double incomingLength = 40;
		 double incomingWidth = 90;
		 rect1.setLength(incomingLength);
		 rect1.setWidth(incomingWidth);
		 
		 System.out.println(rect1.getLength() + " " +  rect1.getWidth());
		 
		  }
		}
	



// Define the circle class with two constructors
		class SimpleCircle {
		 private double radius;
		 
		  /** Construct a circle with radius 1 */
		  SimpleCircle() {
		    radius = 1;
		  }

		  /** Construct a circle with a specified radius */
		  SimpleCircle(double newRadius) {
		    radius = newRadius;
		  }

		  /** Return the area of this circle */
		  double getArea() {
		    return radius * radius * Math.PI;
		  }

		  /** Return the perimeter of this circle */
		  double getPerimeter() {
		    return 2 * radius * Math.PI;
		  }

		
		//getter for radius
		  public double getRadius() 
		    {
		    	return radius;
		    }
		 
		  //setter for radius
		  public void setRadius(double incomingRadius)
		  {
			  radius = incomingRadius;
		  }	    
}
		
		
//SimpleRectangle Class
		class SimpleRectangle {

		//rectangle data fields.
		private double length;
		private double width;

		//rectangle constructor.
		SimpleRectangle(double length, double width)
		
		{
			this.length = length;
			this.width = width;
			
		}
		
		
		//getter for length
		public double getLength()
		{
			return length;
		}
		
		//setter for length
		public void setLength(double incomingLength)
		{
			this.length = incomingLength;
		}

		//setter for width
		public void setWidth(double incomingWidth)
		{
			this.width = incomingWidth;
		}
		
		//getter for width
		public double getWidth()
		{
		return width;
		}
		
		//get area method
		public double getArea()
		{
			double area = width * length;
			return area;
		}
		
		//get perimeter method
		public double getPerimteter()
		{
			double perimeter = (width * 2) + (length * 2);
			return perimeter;
		}
	

}		
//end of SimpleRectangle class
