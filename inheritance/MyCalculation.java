package inheritance;
//In the given program, when an object to MyCalculation class is created, a copy of the contents of the superclass is made within it.
//That is why using the object of the subclass you can access the members of a superclass.
public class MyCalculation extends Calculation {
	
	public void Multiplication(int x, int y) {
		z = x * y;
		System.out.println("The procut of the given numbers:"+z);
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		MyCalculation demo = new MyCalculation();
		MyNewCalculation demo1 = new MyNewCalculation();
		demo.Addition(a, b);
		demo.Subtraction(a, b);
		demo.Multiplication(a, b);
		demo1.Division(a, b);
		
	}

}
