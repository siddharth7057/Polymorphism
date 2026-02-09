/*4. Problem:
 Create a class MaximumFinder with overloaded findMax methods to:
Return the maximum of two integers
Return the maximum of three integers
Return the maximum of two floats
Expected Overloads:
int findMax(int a, int b);
int findMax(int a, int b, int c);
float findMax(float a, float b);
*/


public class Q4MaximumFinder
{
	public static void main(String x[])
	{
		MaximumFinder mf = new MaximumFinder();
		System.out.println("Maximum : "+mf.findMax(10,50));
		System.out.println("Maximum : "+mf.findMax(50,34,75));
		System.out.println("Maximum : "+mf.findMax(7.65f, 2.654f));
	}
}
class MaximumFinder
{	
	int findMax(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}

	int findMax(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		return c;
	}
	
	float findMax(float a, float b)
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}
}