package calculator;

public class Subtraction implements Calculation {

	@Override
	public void calculate(int x, int y) {
		
		System.out.println("The subtraction of two numbers is "+(x-y));
		
	}
	
}
