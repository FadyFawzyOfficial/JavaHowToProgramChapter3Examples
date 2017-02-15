// Fig. 3.11:GradeBookTest.java Author: Eng.Fady Fawzi  Created:13/9/2016
// GradeBook constructor used to specify the course name at the
// time each Gradebook object is created.

public class GradeBookTest 
{
    // main method begins program execution
    public static void main( String[] args )
    {
        // create Gradebook object
        GradeBook gradeBook1 = new GradeBook( 
                "Introduction to Java" );
        GradeBook gradeBook2 = new GradeBook(
                "Java Programming" );
        // display initial value of courseName for each Gradebook
        System.out.printf( "gradeBook1 course name is: %s\n",
                gradeBook1.getCourseName() );
        System.out.printf( "gradeBook2 course name is: %s\n",
                gradeBook2.getCourseName() );
    } // end main
} // end class GradeBookTest