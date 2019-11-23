package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)Learnt to write code with for loop
	 * 2)Learnt to print a value in java code 
	 * 3)Learnt to write code with Switch case 
	 * 
	 */	

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c;
		String operation = "MUL";

		switch (operation) {
		case "ADD":
			c= a+b;
			System.out.println("Addition of  a and b:"+c);
			break;

		case "SUB":
			c=a-b;
			System.out.println("Subtraction of  a and b:"+c);
			break;

		case "MUL":
			c=a*b;
			System.out.println("Multiplication of  a and b:"+c);
			break;

		case "DIV":
			c=a/b;
			System.out.println("Division of  a and b:"+c);
			break;

		default:
			System.out.println("Not a valid Operation. Please provide any of the below operation:");
			System.out.println("ADD");
			System.out.println("SUB");
			System.out.println("MUL");
			System.out.println("DIV");

			break;
		}
		// Declare 2 integer numbers


		// Declare a String variable with input as operations (Tip:


		// Initiate switch case for operations


		// Within switch, include as case for add operation


		// Within switch, include as case for sub operation


		// Within switch, include as case for mul operation


		// Within switch, include as case for div operation


		// Within switch, include 'default' to handle other operations


		//end of switch case

	}

}
