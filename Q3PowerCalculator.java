/*
3. Problem:
 Create a class PowerCalculator with overloaded methods to calculate power:
power(int base, int exponent) → for integer power
power(double base, int exponent) → for floating-point base
power(int base) → returns square of the number (exponent = 2)
Expected Overloads:
int power(int base, int exponent);
double power(double base, int exponent);
int power(int base); // returns base * base
*/

public class Q3PowerCalculator
{
	public static void main(String x[])
	{
		PowerCalculator pw = new PowerCalculator();
		System.out.println("Integer Power : "+pw.power(2,3));
		System.out.println("Floating-point base power : "+pw.power(2.0,3));
		System.out.println("Exponent 2 : "+pw.power(2));
	}
}
class PowerCalculator
{
	int power(int base, int exponent)
	{
		int power = 1;
		for(int i=1;i<=exponent;i++)
		{
			power = power * base;
		}
		return power;
	}
	
	double power(double base, int exponent)
	{
		double power = 1;
		for(int i=1;i<=exponent;i++)
		{
			power = power * base;
		}
		return power;
	}
	int power(int base)
	{
		return base * base;	
	}
}