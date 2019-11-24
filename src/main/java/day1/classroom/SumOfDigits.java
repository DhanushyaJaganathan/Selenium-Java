package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)

		// Initialize an integer variable by name: sum

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??

		// Within loop: get the remainder when done by 10 -> Tip: use mod

			// Print the remainder to confirm
	
			// Within loop: add that remainder to the sum
	
			// Print the sum to confirm
	
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
	
			// Print the quotient to confirm
		
		// Outside the loop: print the final sum
		
		int sum=123,quo=123;
		int rem=0;
		int s=0;
		while(quo>0) {
		rem=sum%10;
		 System.out.println("Remainder "+rem);
		 s=s+rem;
		 System.out.println("Sum "+s);
		 quo=sum/10;
		 sum=quo;
		 System.out.println("quoitent "+quo);
		 
		}
		 System.out.println();
		 System.out.println();
		 System.out.println("toal sum :"+s);

	}
}
