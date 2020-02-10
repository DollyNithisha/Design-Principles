package calculator;

public class Addition implements Calculation {

	@Override
	public void calculate(int x, int y) {
		
		System.out.println("The addition of two numbers is "+(x+y));
		
	}
	
}
