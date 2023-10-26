package planet_age;
//Import introduces the swing package
import javax.swing.*;

public class Planet_AgeClass {
		public static void main(String[]args)
		{

	//User inputs data
	String earthName = JOptionPane.showInputDialog("Enter Your Name:");
	String earthAgeString = JOptionPane.showInputDialog("Enter Your Age:");
	
	//System unchanging variables
	final float EARTHDAYS = 365;
	final float MERCURYDAYS = 88;
	final float VENUSDAYS  = 225;
	final float JUPITERDAYS = 4380;
	final float SATURNDAYS = 10767;
	
	//Output variables
	float mercuryAge;
	float venusAge;
	float jupiterAge;
	float saturnAge;
	
	//Converts earthAge to integer
	int earthAge = Integer.parseInt(earthAgeString);
	
	//Calculations to get planetary ages
	mercuryAge = earthAge*EARTHDAYS/MERCURYDAYS;
	venusAge = earthAge*EARTHDAYS/VENUSDAYS;
	jupiterAge = earthAge*EARTHDAYS/JUPITERDAYS;
	saturnAge = earthAge*EARTHDAYS/SATURNDAYS;
	
	//String.format method regulates float to 2 decimals spaces
	String fMercuryAge = String.format("%.2f",mercuryAge);
	String fVenusAge = String.format("%.2f",venusAge);
	String fJupiterAge = String.format("%.2f",jupiterAge);
	String fSaturnAge = String.format("%.2f",saturnAge);
	
	//Output is secured in the String
	String outputStr ="My name is " + earthName + " and I'm " + earthAge + " years old\n" +
	"I'm ancient on Mercury as I would be " + fMercuryAge + " years old\nMy age on Venus is a couple decades "
	+ "older as I would be " + fVenusAge + " years old\nI'm extremely young on Jupiter as I would be " + fJupiterAge + 
	" years old\nIn terms of age i'm astronomically young on Saturn as I would be " + fSaturnAge + " years old";
	
	//Results output in a pop-up dialog box
	JOptionPane.showMessageDialog(null,outputStr,"My Planetary Ages",JOptionPane.WARNING_MESSAGE);
	
	
		}//end of main
}//end of class