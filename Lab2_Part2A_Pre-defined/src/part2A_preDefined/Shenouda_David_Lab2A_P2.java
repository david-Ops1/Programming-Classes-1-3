package part2A_preDefined;

import java.util.Scanner;

public class Shenouda_David_Lab2A_P2 {

	public static void main (String [] args) {
	
		Scanner console = new Scanner(System.in);//Declaring console
		
		String variable = null;//Declaring variables
		boolean letter;
		boolean digit;
		boolean lowerCase;
		boolean upperCase;
		int count = 0;
		
		
		 while(count > 1 || count == 0) {//Initializing the while loop
			count = 0;
			 System.out.println("Enter a character (only one)");
			 variable = console.next();
			 for(int i = 0; i < variable.length(); i++) {//Counts the number of characters in a string
				 if(variable.charAt(i) != ' ') { 
	        	count++;
				 }
			 }
			 if (count > 1) {//Error message if one enters more then one character
				 System.out.println("You enetered more than one character. Please try again");
			 }
		 }
		
		 char variableConvert=variable.charAt(0);//Converts the first string character to a charter
		 
		 letter=Character.isLetter(variableConvert);//Series of booleans to check if it is true or false
		 digit=Character.isDigit(variableConvert);
		 lowerCase=Character.isLowerCase(variableConvert);
		 upperCase=Character.isUpperCase(variableConvert);
		 
		 System.out.println("Entered character is:" + variableConvert);//Print to the console of the results
		 System.out.println("isLetter:" +letter);
		 System.out.println("isDigit:"+digit);
		 System.out.println("isLowerCase:"+ lowerCase);
		 System.out.println("isUpperCase:"+upperCase);
		 count++;
	        
		 
			 
	        
		 console.close();
	}
}
	

		
