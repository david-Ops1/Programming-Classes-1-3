package part2B_userDefined;

import java.util.Scanner;

public class Shenouda_David_Lab2B_P2 {
	
	static Scanner console = new Scanner (System.in);
	
	public static void main (String [] args) {
		double remainder1= 0.0;
		double divisor1 = 0.0;
		double dividend1 = 0.0;
		
		System.out.println("what is the divisor?");
		divisor1=console.nextDouble();
		
		System.out.println("what is the dividend?");
		dividend1=console.nextDouble();
		
		remainder1 = Shenouda_David_Lab2B_P2.getRemainder(divisor1, dividend1);
			System.out.println("the remainder of the equation "+ dividend1 +" divided by " + divisor1
					+ "is:"+ remainder1);
	}
public static double getRemainder(double divisor2, double dividend2) {
	int remainder2;
	remainder2 =(int)dividend2%(int)divisor2;
	return remainder2;
	}

}