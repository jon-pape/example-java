import java.util.Scanner;

/**
 * Some example Java code
 * @author Jonathan Pape
 *
 */

public class Example {

	/**
	 * This is the main method the entry point for any Java program
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * User Input
		 */
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter your name: ");
		String myStr = scan.next(); //get next input value as String
		
		//print each char in myStr
		System.out.println(); //print a blank line
		System.out.println("Hello, " + myStr + "!");
		
		scan.close();
		
	}
	

}
