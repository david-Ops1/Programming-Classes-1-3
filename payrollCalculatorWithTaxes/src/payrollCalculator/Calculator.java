package payrollCalculator;

import java.io.*;
import java.util.Scanner;

public class Calculator {
	/* CSIS 262
	 * David Shenouda
	 * Program #1
	 * Class period TTh 2-3:15 P.M.
	 * 
	 * This program extracts data from a text file and outputs
	 * information in another text file. The program takes the
	 * hours worked in a week\Salaried weeks and pay rate of multiple employees
	 * and calculates their gross pay for the week. This program also
	 *calculates net pay from employee's withholdings This program also distinguishes
	 * from hourly and salaried employees.
	 */

	
	public static void main(String[] args) throws IOException
	{
		//Initializing file input scanner, FileWriter,PrintWriter and output file
		File outFile = new File ("OutputPayroll.txt");
		Scanner inFile = new Scanner (new FileReader("inputPayroll.txt"));
		FileWriter fWriter = new FileWriter (outFile,false);
		PrintWriter pWriter = new PrintWriter (fWriter);
		
		//Declaring variables to be extracted from the text document
		String empID = "";
		String lastName = "";
		String firstName = "";
		String empType = "";
		double hoursWorked = 0.0;
		double payRate = 0.0;
		double withholdings = 0.0;
		double salary = 0.0;
		double grossEarnings= 0.0;
		double netEarnings = 0.0;
		double overTimeRate = 1.5;
		double paidWeeks = 46.0;
		
		//prints the header
		pWriter.printf("%-15s\t%-15s\t\t%-15s", "EmpID",
				"Gross Earnings","Net Earnings");
		pWriter.println("\n=====================================================");
		
		//Retrieves every piece of data from the text document until there is none left
		while(inFile.hasNext()) {
		lastName = inFile.next();		//Retrieves each piece of data from the listed lines
		firstName = inFile.next();
		empID = inFile.next();
		empType = inFile.next();
		
		//Series of if else statements to determine if Employee is hourly or salaried
		if (empType.equalsIgnoreCase("Hourly") || empType.equalsIgnoreCase("Salary")) {
			if (empType.equalsIgnoreCase("Hourly")) {
				hoursWorked = inFile.nextDouble();
				payRate = inFile.nextDouble();
				withholdings = inFile.nextDouble();
				
				if  (hoursWorked>= 41) {
					grossEarnings= 40*payRate+(hoursWorked-40)*payRate*overTimeRate;		//Calculates gross pay of hourly employees with overtime
				}
				
				else if(hoursWorked<=40) {
					grossEarnings = hoursWorked * payRate;		//Calculates gross pay of hourly employees without overtime
				}		
			}
			
			else if (empType.equalsIgnoreCase("Salary")) {
				salary = inFile.nextDouble();
				withholdings = inFile.nextDouble();
				grossEarnings= salary/paidWeeks;		//Calculates gross pay of salaried employees
			}
			//Calculates net pay of all types of employees
			netEarnings = grossEarnings*(1-withholdings);
			
			//Prints information in neatly organized columns
			pWriter.printf("%-15s\t$%-15.2f\t$%-15.2f\n",empID,grossEarnings,netEarnings);
		}

			else { 
				pWriter.println("Invalid Employee Type");		//Error message for empType if it does not match criteria
			}
			
		}
	//end of file scanner
		
	inFile.close();
	pWriter.close();
		
		}
	}
