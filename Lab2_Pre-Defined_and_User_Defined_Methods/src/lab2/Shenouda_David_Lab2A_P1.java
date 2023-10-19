package lab2;

import java.util.Scanner;

public class Shenouda_David_Lab2A_P1 {
	
	public static void main (String [] args) {
		
		//Declaring variables
		double A = -16.0;
		double B = 0.0;
		double C = 100.0; 
		
		double D = -2.5;
		double dFloor = 0.0;
		double dCeil = 0.0;
		double eFloor = 0.0;
		double eCeil = 0.0;
		
		double E = 75.3;
		double F = 0.0;		
		double G = 0.0;
		double H = 0.0;
		double I = 0.0;
		
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 3;
		double diff_x2x1 = 0.0;
		double diff_y2y1 = 0.0;
		double pow_x2x1 = 0.0;
		double pow_y2y1 = 0.0;
		double sum_totdist = 0.0;
		double distance = 0.0;
		double y2 = 5;
		
		double Hpot = 9.0;
		double side_y = 7.0;
		double side_x = 0.0;
		double sum_Hpot = 0.0;
		double sum_y = 0.0;
		double diffOfBothSides = 0.0;
		
		Scanner console = new Scanner(System.in);//Declaring console
		
		System.out.println("Enter A value");//Series of questions to get values of the variables
		A = console.nextDouble();
		
		System.out.println("Enter B value");
		B = console.nextDouble();
		
		System.out.println("Enter C value");
		C = console.nextDouble();
		
		System.out.println("Enter D value");
		D= console.nextDouble();
		
		System.out.println("Enter E value");
		E = console.nextDouble();
		
		System.out.println("Enter F value");
		F = console.nextDouble();
		
		G = Math.abs(A);//Pre-defined method for absolute value
		
		G =Math.sqrt(G);//Pre-defined method for getting square root
		
		System.out.println("Sqrt(|" + A + "|) = " + G + "\n");
		
		H = Math.sin(F);//Pre-defined method for getting sin
		
		I = Math.cos(F);//Pre-defined method for cos
		
		System.out.println("sin of F " + H + "\ncos of F " + I +"\n");//Outputs to the console the results
		dFloor = Math.floor(D);
		System.out.println("floor(" + D + ") = ["+ D +"] = " + dFloor);
		dCeil = Math.ceil(D);
		System.out.println("ceil(" + D + ") = [" + D + "] = " + dCeil);
		eFloor = Math.floor(E);
		System.out.println("floor(" + E + ") = [" + E + "] = " + eFloor);
		eCeil = Math.ceil(E);
		System.out.println("ceil(" + E +") = [" + E + "] = " + eCeil);
		
		
		diff_x2x1 = x2 - x1;//Calculations
		pow_x2x1 =Math.pow(diff_x2x1,2);
		diff_y2y1 = y2 - y1;
		pow_y2y1 =Math.pow(diff_y2y1,2);
		sum_totdist = pow_y2y1 + pow_x2x1;
		distance=Math.sqrt(sum_totdist);
		
		String distancef = String.format("%.2f", distance);//Formatting the double to String to two places past the decimals place
		
		System.out.println("\ndistance=sqrt(x2-x1)^2+(y2-y1)^2\n"//Output of the distance calculation to console
				+ "distance=sqrt("+x2+"-"+x1+")^2+("+y2+"-"+y1+")^2\n"
				+"distance=sqrt("+diff_x2x1+")^2+("+diff_y2y1+")^2\n"
				+"distance=sqrt("+pow_x2x1+")+("+pow_y2y1+")\n"
				+"distance=sqrt("+sum_totdist+")\n"
				+"distance="+distancef);
		
		
		sum_Hpot = Math.pow(Hpot,2);//Pow method
				
		sum_y = Math.pow(side_y, 2);//Pow method
		
		diffOfBothSides= sum_Hpot - sum_y;//calculation
		
		side_x = Math.sqrt(diffOfBothSides);//Square root function
		System.out.println("\nc^2+" + side_y + "^2=" + Hpot + "^2\nc^2="//Output to the console
				+ Hpot + "^2-" + side_y + "^2\nc^2=" + sum_Hpot + "-" + sum_y + "\n"
				+ "sqrtc^2=sqrt" + diffOfBothSides + "\nc=" + side_x);
		
		
		/*pre-defined methods are already implemented in the system
		 *while user defined method is a method that the user creates.
		 *
		 *void methods are methods that do not return data. These
		 *methods don't have return statements to return variables.
		 *
		 *Value-returning methods- are methods that return data. these
		 *methods return data using the return statement.
		 *Neither are void methods
		 *
		 *Parameters are used inside the method body and will imitate
		 *the values of the arguments passed through.
		 *
		 *Arguments are the actual values that get passed through when
		 *the method runs.
		 * 
		 */
		console.close();
}
}

