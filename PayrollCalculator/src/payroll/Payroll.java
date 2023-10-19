package payroll;

import java.io.*;
import java.util.Scanner;

public class Payroll {
	/* CSIS 162
	 * David Shenouda
	 * Program #1
	 * Class period TTh 2-3:15 P.M.
	 * 
	 * This program extracts data from a text file and outputs
	 * information in another text file. The program takes the
	 * hours worked in a week and pay rate of multiple employees
	 * and calculates their gross pay for the week.
	 * 
	 */

	public static void main(String[] args) throws FileNotFoundException
	{
		//Initializing file input scanner
		Scanner inFile = new Scanner (new FileReader("Shenouda_David_Lab1_E2_employeeData.txt"));
		
		//Declaring variables to be extracted from the text document
		String ID = "";
		String lastName = "";
		String firstName = "";
		double hoursWorked = 0.0;
		double payrate = 0.0;
		double grossPay = 0.0;
		
		//prints the header
		System.out.printf("%-15s\t%-15s\t%-15s\t%-15s", "ID",
				"Last Name","First Name","Gross Pay");
		System.out.print("\n=====================================");
		System.out.println("============================");
		
		//Retrieves every piece of data from the text document until there is none left
		while(inFile.hasNext())
		{
			//Retrieves each piece of data from the listed lines
			ID = inFile.next();
			lastName = inFile.next();
			firstName = inFile.next();
			hoursWorked = inFile.nextDouble();
			payrate = inFile.nextDouble();
			
			//Calculates gross pay
			grossPay = hoursWorked*payrate;
			
			//Prints information in neatly organized columns
			System.out.printf("%-15s\t%-15s\t%-15s\t$%,-15.2f\n",
					ID,lastName,firstName,grossPay);
		}
		
		//end of file scanner
		inFile.close();
	}
	
		
		
	}

