package calculator;

public class Multiplication implements Calculation {

	@Override
	public void calculate(int x, int y) {
		
		System.out.println("The multiplication of two numbers is "+(x*y));
		
	}
	
} 
