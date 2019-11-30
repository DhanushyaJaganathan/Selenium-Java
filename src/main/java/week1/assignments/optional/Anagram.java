package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stop";
		//Declare another String
		String text2 = "pots";

		//build logic to check the given words are anagram or not

		/*
		 * Pseudo Code
		 * a) Check length of the strings are same then
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		int count=0;
		int length1 = text1.length();
		int length2 = text2.length();

		if(length1==length2) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//System.out.println(charArray1);
			//System.out.println(charArray2);

			for (int j = 0; j < text1.length(); j++) {
				if(charArray1[j]==charArray2[j]) {
					count++;
				//	System.out.println(count);
					//System.out.println(charArray1[j]);
				//	System.out.println(charArray2[j]);
				}
				else
				{
					count=0;
				}
				

			}
			if(count==text1.length()) {
				
				System.out.println("Given word is anagram");
				
			}else {
				System.out.println("Given word is not an anagram");
			}
					}
		else {
		System.out.println("Given word is not an anagram");
		}
	}

}