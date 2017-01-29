
import java.util.Scanner;
// Fig. 3.8: GradeBookTest.java Author: Eng.Fady Fawzi  created: 1/9/2016
// Creating and manipulating a GradeBook object.
public class GradeBookTest 
{
    // main method begins program execution
    public static void main( String[] args )
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        
        // create GradeBook object and assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();
        
        // display initial value of courseName
        System.out.printf( "Initial course name is: %s\n\n",
                myGradeBook.getCourseName() );
        
        // prompt for and read course name
        System.out.println( "Please, Enter the course name:" );
        String theName = input.nextLine(); //read a line of text
        myGradeBook.setCourseName( theName ); // set the course name
        System.out.println(); // outputs a blank line
        
        // display welcome message after specifying course name
        myGradeBook.displayMessage();
    } // end main
} // end class GradeBookTest