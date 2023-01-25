package inheritance;
//Following is an example demonstrating Java inheritance. In this example, you can observe two classes named Calculation and MyCalculation.
//Using extends keyword. the MyCalculation inherits the method Addition() and Subtraction() of Calculation class.
public class Calculation {
	
	int z;
	
	public void Addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of given nymbers: " + z);
		
	}
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers is:" + z);
		
	}
}
