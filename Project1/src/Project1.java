import javax.swing.*;

import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Project1 {
	public static String[] totalOfWords; 
	public static int counter_totalOfWords, counter_validWord, counter_invalidWord = 0;
	public static String[] validWord;
	public static String[] invalidWord;
	static BufferedReader x;
	/**
	 * 
	 *	@author Tommaso Coraci
	 *	@since 10/06/20
	 *	@version 1
	 *	@description checks the all words, the valid words, and invalid words and the
	 *
	 *
	 **/
	
/**
 * 
 * @param arr passes the string array 
 * @param n passes the counter size of the array 
 * 
 */
	
	public static void selectionSort(String[] arr, int n) { // uses the selection sort to sort in alphabetical order of valid array
		for (int i = 0; i < n - 1; i++) { 
			int smallestWord = i;  
			for (int j = i + 1; j < n; j++) {
				if ((arr[j].compareToIgnoreCase(arr[smallestWord])) < 0) { 
					smallestWord = j; 
				}
			}
			String temp = arr[i];
			arr[i] = arr[smallestWord];
			arr[smallestWord] = temp;
		}
	}

	public static void main(String[] args) { //this stores the file that has the strings into the array of totalOfWords

		totalOfWords = new String[1000];
		validWord = new String[1000];
		invalidWord = new String[1000];
		File myFile = new File("Words.txt");

		try { 
			x = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
			String readLine = x.readLine();
		while (readLine != null) {
				StringTokenizer listOfWords = new StringTokenizer(readLine);
				while (listOfWords.hasMoreTokens()) {
					totalOfWords[counter_totalOfWords++] = listOfWords.nextToken();
				}
				readLine = x.readLine();
			}
			x.close();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}//up to here 

		for (int i = 0; i < counter_totalOfWords; i++) { // this for loop checks to see if each word in the totalwords array matches with any word in the alphabet if its uppercase or lowercase
			boolean isValid = true; 
			for (int j = 0; j < totalOfWords[i].length(); j++) {
				if (!totalOfWords[i].matches("[a-zA-Z]+")){
					isValid = false;
				}
			}
			if (isValid) {
				validWord[counter_validWord++] = totalOfWords[i];
			} else {
				invalidWord[counter_invalidWord++] = totalOfWords[i];
				 
			}
		}
		selectionSort(validWord, counter_validWord); 
		new WordGUI(totalOfWords, validWord,  invalidWord); 
		WordGUI2 gui2 = new WordGUI2();
		
		for (int i = 0; i < counter_totalOfWords; i++) {
			gui2.addToMasterArea(totalOfWords[i] + "\n");
		}
		for (int i = 0; i < counter_validWord; i++) {
			gui2.addToValid(validWord[i] + "\n");
		}
		for (int i = 0; i < counter_invalidWord; i++) {
			gui2.addToInvalid(invalidWord[i] + "\n");
		}
}





}
