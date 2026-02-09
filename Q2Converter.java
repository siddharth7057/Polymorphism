/*
2. Problem:
 Create a class Converter with overloaded methods convert to:
Convert kilometers to miles
Convert Celsius to Fahrenheit
Convert a character to its ASCII value
Expected Overloads:
double convert(double km);         // convert km to miles
double convert(int celsius);       // convert Celsius to Fahrenheit
int convert(char ch);              // convert char to ASCII
*/


public class Q2Converter
{
	public static void main(String x[])
	{
		Converter c = new Converter();
		double result = c.convert(10.0);
		System.out.println("Miles : "+result);
		result = c.convert(1);
		System.out.println("Fahrenheit : "+result);
		int ascii = c.convert('a');
		System.out.println("ASCII : "+ascii);
	}
}

class Converter
{
	double convert(double km)
	{
		return km * 0.6213712;
	}
	double convert(int celsius)
	{
		return (celsius * 9.0/5) + 32;
	}
	int convert(char ch)
	{
		return ch;
	}
}