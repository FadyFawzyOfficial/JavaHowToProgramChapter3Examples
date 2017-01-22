// Fig. 3.5: GradeBookTest.java	Author: Eng.Fady Fawzi	Created: 31/8/2016
// Class GradeBook object and pass a String to its displayMessage method.

import java.util.Scanner; // program uses Scanner

public class GradeBookTest
{
	// main method begins program execution
	public static void main( String[] args )
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		// prompt for and input course name
		System.out.println( "Please, Enter the course name:" );
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println(); // outputs a blank line
		
		// call myGradeBook's displayMessage method
		//and pass nameOfCourse as an argument
		myGradeBook.displayMessage( nameOfCourse );
	} // end main
} // end class GradeBookTest