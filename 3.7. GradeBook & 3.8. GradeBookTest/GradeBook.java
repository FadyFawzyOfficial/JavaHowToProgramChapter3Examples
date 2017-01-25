
// Fig. 3.7:GradeBook.java  Author: Eng.Fady Fawzi  Created: 1/9/2016
// GradeBook class that contains a courseName instance variable
// and method to set and get its value.
public class GradeBook
{
    private String courseName; // course name for this GradeBook
    
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
        // call the getCourseName to get the name of
        // the course this GradeBook represents
        System.out.printf( "Welcome to the grade book for\n%s!\n",
                getCourseName() );
    } // end method displayMessage
} // end class GradeBook