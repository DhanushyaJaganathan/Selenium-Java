package week1.assignments.optional;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
		String text = "Tes12Le79af65";
		// Declare a int variable sum
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		//build a logic to get sum of all the digits from the given string

		/*
		 * Method 1
		 * Pseudo Code
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */

		/*
		 * Method 2
		 * Pseudo Code
		 * 
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.isDigit() and add it to sum
		 * d) Now Print the value
		 */	
		char[] charArray = text.toCharArray();
		for (int i = 0; i < text.length(); i++) {
			//	System.out.print(charArray[i]);
			if (Character.isDigit(charArray[i])){
				//	System.out.println();
				//	System.out.println("i is"+i+"="+charArray[i]);
				//	System.out.println("before sum="+sum1);
				//	System.out.println("before sum="+charArray[i]);

				sum=sum+charArray[i];

			}
			else {
				int numericValue = Character.getNumericValue(charArray[i]);
				//	System.out.println(); 

				//	System.out.print("i is"+i+"="+numericValue);
				//	System.out.println("before sum="+sum2);

				sum=sum+numericValue;
				//	System.out.println();

				//		System.out.println("sum="+sum2);

			}

		}
		System.out.println("tot="+sum);

	}

}
