package part1BUserDefined;

import java.util.Scanner; //Importing scanner

public class Shenouda_David_Lab2B_P1 {
	
	static Scanner console = new Scanner (System.in);//Declaring scanner console
	
	public static void main (String [] args) {
		
		//Declaring variables
		String name1 = null;
		double side1= 0.0;
		double side2 = 0.0;
		double divisor1 = 0.0;
		double dividend1 = 0.0;
		double aVar1= 0.0;
		double bVar1 = 0.0;
		double cVar1 = 0.0;
		double blockSize1 = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		double y1 = 0.0;
		double y2 = 0.0;
		
		
		Shenouda_David_Lab2B_P1.getGreeting();//Caller for void method getGreeting
		
		System.out.println("what is your name?");//Asking user for his/her name
		name1=console.next();
		
		String greetings2 = Shenouda_David_Lab2B_P1.getName(name1);//Caller for String method getName
			
		System.out.println(greetings2);//Caller for String method greetings2
		
		System.out.println("what is the first side of your right triangle?");//Asking for sides of the triangle
		side1=console.nextDouble();
		
		System.out.println("what is the second side of your right triangle?");
		side2=console.nextDouble();
		
		double hypotenuse = Shenouda_David_Lab2B_P1.myPyth(side1,side2);// Finding the hypotenuse by calling myPyth double method
		System.out.println("A right triangle with the side of: " + side1 + "and the second"
				+ " side of: " + side2 + "equals the hypotenuse of: " + hypotenuse + "\n");
		
		System.out.println("what is the divisor?");//Asking user for divisor and dividend and storing it
		divisor1=console.nextDouble();
		
		System.out.println("what is the dividend?");
		dividend1=console.nextDouble();
		
		
		double remainder1 = Shenouda_David_Lab2B_P1.getRemainder(divisor1, dividend1);//Caller for double method getRemainder
		System.out.println("the remainder of the equation "+ dividend1 + " divided by " + divisor1
				+ "is:" + remainder1);
		
		double intergerDiv1 = Shenouda_David_Lab2B_P2.getIntergerDiv(divisor1, dividend1);//Caller for double method getIntergerDiv 
		System.out.println("the interger division of " + dividend1 + " by "+ divisor1
					+ "equals:" + intergerDiv1);
		
		System.out.println("what is the A variable?");//Asking user for A-C variables and stores them in variables
		aVar1=console.nextDouble();
		
		System.out.println("What is the B variable?");
		bVar1=console.nextDouble();
		
		System.out.println("What is the C variable?");
		cVar1=console.nextDouble();
		
		double ans = Shenouda_David_Lab2B_P1.getAns(aVar1,bVar1,cVar1);//Caller for double method getAns
		System.out.println("The answer to the equation of " + bVar1 + "^2-"
				+ aVar1 + "/" + cVar1 + "+(5*" + cVar1 + "-2*" + aVar1 + ")/("
				+ bVar1 + "+1)-2="+ans);
		
		System.out.println("what is the size of the pattern block?");//Asks user for block size
		blockSize1=console.nextInt();
		
		Shenouda_David_Lab2B_P1.getBlock(blockSize1);//Caller for void method getBlock
		
		System.out.println("what is x1?");//Asks for distance coordinates
		x1=console.nextDouble();
		System.out.println("What is x2?");
		x2=console.nextDouble();
		System.out.println("What is y1?");
		y1=console.nextDouble();
		System.out.println("What is y2?");
		y2=console.nextDouble();
		
		double distance1 =Shenouda_David_Lab2B_P1.getDistance(x1,x2,y1,y2);//Caller for double method getDistance
		System.out.println("The distance of of the equation with"
				+ "sqrt(" + x2 + "-" + x1 + ")^2+(" + y2 + "-" + y1
				+ ")^2 is d= " + distance1);
		
		
	}
	public static void getGreeting() {//getGreeting method
	System.out.println("Hello! I bid you great tidings.\n");
	return;
	}
	public static String getName(String name2) {//getName method
		String greetingsM ="\nHello " + name2 + " ! I bid you great tidings.\n";
		return greetingsM;
	}
	public static double myPyth(double side1M, double side2M){//myPyth method
		double hypotenuse;
		double sumOfSides;
		sumOfSides = Math.pow(side1M,2) + Math.pow(side2M,2);//Calculation for Pythagorean theorem a^2+b^2=c^2
		hypotenuse = Math.sqrt(sumOfSides);
		return hypotenuse;
		
	}
	public static double getRemainder(double divisor2, double dividend2) {//getRemainder method
		int remainder2;
		remainder2 =(int)dividend2%(int)divisor2;//Calculation to get the remainder in integer division
		return remainder2;
	
	}
	public static double getIntergerDiv(double divisor3, double dividend3) {//getIntergerDiv method
		int intergerdiv2;
	intergerdiv2 = (int)dividend3/(int)divisor3;//Calculation to get integer division result
	return intergerdiv2;
}
	public static double getAns(double aVar2, double bVar2, double cVar2) {//getAns method
		double ans2;
		if(((bVar2+1)-2)!=0 && (cVar2+(5*cVar2-2*aVar2)!=0)){//If else statement to insure 0 does not get divided
			ans2 = Math.pow(bVar2,2)-aVar2/cVar2+(5*cVar2-2*aVar2)/(bVar2+1)-2;
		}
			else {
				System.out.println("Error");
				ans2=0;
			}
			return ans2;
	}
	public static void getBlock(double blockSize2) {//getBlock method
		for(int i =0;i<blockSize2+1;i++) {//
			for(int b =0;b<blockSize2-i;b++) {//Loop for deciding how many &
			System.out.print("&");
		}
			for(int p=1;p<=i;p++) {//Loop for deciding how many *
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
	
	public static double getDistance(double x1M, double x2M,double y1M,double y2M) {//getDistance method
		double distance2;
		distance2=Math.sqrt(Math.pow((x2M-x1M),2)+Math.pow((y2M-y1M),2));//Formula for distance
		return distance2;
		
	
	}

}



