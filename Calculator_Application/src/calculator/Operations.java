package calculator;

import java.util.*;
public class Operations {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			
			int a,b,x=1;
			while(x!=0) {
				System.out.println("Enter first number:");
				a=s.nextInt();
				System.out.println("Enter second number:");
				b=s.nextInt();
				System.out.println("Enter a number:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
				int c=s.nextInt();
				
				switch(c) {
				
				case 1:Addition add=new Addition();
					   add.calculate(a,b);
				       break;
				
				case 2:Subtraction sub=new Subtraction();
					   sub.calculate(a,b);
			           break;   
				
				case 3:Multiplication mul=new Multiplication();
					   mul.calculate(a,b);
			           break; 
				
				case 4:Division div=new Division();
					   div.calculate(a,b);
			           break;   
				}
				
				System.out.println("Press 1 to continue ,0 to exit");
				x=s.nextInt();

			}
		
		}

	}

}
