/*5. Problem:
 Create a class BillGenerator with overloaded generateBill methods to:
Generate bill with base price only
Generate bill with base price and tax
Generate bill with base price, tax, and discount
Expected Overloads:
double generateBill(double price);
double generateBill(double price, double tax);
double generateBill(double price, double tax, double discount);
*/


public class Q5BillGenerator
{
	public static void main(String x[])
	{	
		BillGenerator bg = new BillGenerator();
		System.out.println("Bill : "+bg.generateBill(50.0));
		System.out.println("Bill : "+bg.generateBill(100.0,10.0));
		System.out.println("Bill : "+bg.generateBill(100.0,10.0,10.0));
	}
}
class BillGenerator
{
	double generateBill(double price)
	{
		return price;
	}
	double generateBill(double price, double tax)
	{
		return price + (price * tax/100.0); 
	}
	double generateBill(double price, double tax, double discount) //100,10,10
	{
		double taxedAmount = price + (price * tax/100.0); //100 + 100*10/100 = 110
		return taxedAmount - (taxedAmount * discount/100.0); //110 - 110*10/100 = 99
	}
}