package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		boolean flag = false;
		int count=0;
		/*
		 * Pseudo code 
		 * a) Split the String into array and iterate over it 
		 * b) Initialise another loop to check whether the word is there in the array 
		 * c) if it is available then increase and count by 1. 
		 * d) if the count > 1 then replace the word as "" 
		 * e) print the each word
		 */
		String[] split = text.split(" ");

		for (int i = 0; i < split.length; i++) {
				//System.out.println("i loop"+split[i]);
			for (int j =i+1; j < split.length; j++) {
				//System.out.println("i loop"+split[i]);
				//System.out.println("j loop "+split[j]);
				boolean equalsIgnoreCase = split[i].equalsIgnoreCase(split[j]);
				//System.out.println(equalsIgnoreCase);
				if(equalsIgnoreCase==true) {	
					//System.out.println(count);

					count++;
					//System.out.println(count);

					if(count==1) {
						//System.out.println(j+split[j]);
						//String a=split[j];
						//System.out.println(count);
						String replace =text.replaceFirst(split[j], "");
						System.out.println(replace);

					}

				}
				
			}
		}
		
	}
}