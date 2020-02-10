package calculator;

public class Division implements Calculation {

	@Override
	public void calculate(int x, int y) {
		
		try {
			System.out.println("The division of two numbers is "+(x/y));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}