package day1.classroom;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)Learnt to write code with for loop
	 * 2)Learnt to print a value in java code 
	 * 
	 * 
	 */	

	public static void main(String[] args) {
		int factorial=1;

		for (int i = 5; i >0 ; i--) {

			factorial= factorial*i;

		}
		System.out.println("Factorial of 5 is"+ " "+factorial);






		// Declare your input number


		// Declare and initialize an integer variable by name: fact


		// Iterate from 1 to your input (tip: using loop concept)


		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)


		//End of loop


		// Print factorial (fact)

	}

}
