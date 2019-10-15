	/*
	 * Arielle Watson
	 * CISC 3130 Data Structures
	 * EMPLID: 23690286
	 */
	import java.util.Scanner;
	import java.io.*;
	import java.io.FileNotFoundException;
	
	public class SortInput {
		
		public static void main(String[]args) throws FileNotFoundException {
			readWords(); //calls the read words method
	}
		/*
		 * Method insertionSort()
		 * 
		 * Input
		 * 	char[] word - the word to be sorted converted as an array of characters
		 * Process
		 * 	scans the array to 
		 * Output
		 * 	converts the array to a string, and returns the string
		 */
		public static String insertionSort(char[] word) {
			String sort; //string to be sorted
			int i;
			if (word == null || word.length == 0)
	            return null; // empty array have nothing to sort

	        for (i=0; i < word.length; i++) {
	            char temp = word[i];
	            int j = i;
	            while (j > 0 && word[j-1] > (temp)) {
	                word[j] = word[j-1];
	                j--;
	            }
	            word[j] = temp;
	        }
	        return sort = new String(word).toLowerCase();
	    }
		
		/*
		 * Method sortWord()
		 * Input
		 * 	String s - string to be sorted
		 * Process
		 * 	converts String s to an array of characters
		 * 	calls insertion sort with the array as a parameter
		 * Output
		 * 	returns sorted string
		 */
		public static String sortWord(String s) {
			 char[] c = s.toCharArray();
		        return insertionSort(c);
		}
		/*
		 * Method isUnique()
		 * 
		 * Input
		 * 	String s - a string
		 * Process
		 * 	converts string to an array of string
		 * 	loops through the array to determine if each letter
		 * 	appears once (unique) or more than once (not unique)
		 * Output
		 * 	returns true if the string is unique and false otherwise
		 */
	public static boolean isUnique(String s) {
		char c[] = s.toCharArray(); //convert String s to an array 
		boolean unique= true; //changes to false if the word is not unique
		
		for(int i = 0; i<c.length-1 && unique != false; i++) { //loops through the array to compare characters
			if(c[i] == c[i+1]) {
				unique = false;
			} else {
				unique = true;
		}
	}
		return unique;
	}
	/*
	 * Method readWords()
	 * 
	 * Input
	 * 	none
	 * Process
	 * 	reads words from text file line by line
	 * 	creates a table with the original word, the sorted word, and whether it contains unique characters
	 * Output
	 * 	prints the table with the original word, sorted word, and true or false for uniqueness
	 */
	public static void readWords() {
		String s = ""; 
		String o = ""; 
		
		try {
			File file = new File("test.txt"); //opens the file
			Scanner kybd = new Scanner(file); //wrap a scanner around the file to read from it
			
			System.out.printf("%-18s %-18s %-18s", "Original Word ", "Sorted Word ", "Unique Word ");
			System.out.println("");
			System.out.println("-------------------------------------------------");
			
			while(kybd.hasNextLine()) {	
				System.out.printf("%-18s %-18s %-18s",  o = (kybd.nextLine()), s = sortWord(o), isUnique(s));
				System.out.println("");

		} 
	kybd.close();
		}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
	}
}