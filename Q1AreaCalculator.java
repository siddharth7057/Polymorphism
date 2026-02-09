/*Q1. Problem:
 Write a class AreaCalculator with overloaded methods calculateArea to compute:
Area of a square
Area of a rectangle
Area of a circle
Constraints:
Use method overloading to create different versions of calculateArea.
Expected Overloads:
double calculateArea(double side);                  // square
double calculateArea(double length, double breadth); // rectangle
double calculateArea(float radius);                 // circle
*/


public class Q1AreaCalculator
{
	public static void main(String x[])
	{
		AreaCalculator ac = new AreaCalculator();
		double result = ac.calculateArea(4.0);
		System.out.println("Area of Square is : "+result);
		result = ac.calculateArea(4.0,3.0);
		System.out.println("Area of rectangle is : "+result);
		result = ac.calculateArea(2.5f);
		System.out.println("Area of circle is : "+result);
	}
}
class AreaCalculator
{
	double calculateArea(double side)
	{
		return side * side;
	}
	double calculateArea(double length, double breadth)
	{
		return length * breadth;
	}
	double calculateArea(float radius)
	{
		return Math.PI * radius * radius;
	}
}