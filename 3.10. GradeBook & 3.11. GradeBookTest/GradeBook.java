// Fig. 3.10:GradeBook.java    Author: Eng.Fady Fawzi  Created: 13/9/2016
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
    private String courseName; // course name for this GradeBook
    
    // constructor initializes courseName with String argument
    public GradeBook( String name ) // constructor name is class name
    {
        courseName = name; // initializes courseName
    } // end constructor
    
    // method to set course name
    public void setCourseName( String name )
    {
        courseName = name; // store the course name
    } // end method setCourseName
    
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName
    
    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
        // this statement calls getCourseName to get the 
        // name of the course this Gradebook represents
        System.out.printf( "Welcome to the grade book for\n%s\n",
                getCourseName() );
    } //end method displayMessage
} // end class GradeBook