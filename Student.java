/** Holds the student number and grades for each student
 * 
 * @author Billy Hardy
 * @version 1.0 Build 9000 Sep 7, 2014.
 */

public class Student {

    /**
     * Array of integers, each 
     * one specifying a different grade percentage.
     */
    public int grades[];
    
    /**
     * The unique identifier for each 
     * student object.
     */
    public int sNumber;
    
    /**
     * Class constructor specifying the sNumber and grades.
     */
    public Student(int sNumber, int[] grades) {
	this.sNumber = sNumber;
	this.grades = new int[10];
	for(int i=0; i<10; i++) {
	    this.grades[i] = grades[i];
	}
    }
    
    /**
     * Returns the sNumber of the object
     *
     */
    public int getSNumber() {
	return this.sNumber;
    }
       
    /**
     * Returns the grades of the object
     *
     */
    public int[] getGrades() {
	return this.grades;
    }

    /**
     * Returns the ith grade of the object
     * 
     * @param i  the index of the grade to be returned
     */
    public int getGrade(int i) {
	return this.grades[i];
    }

    /* (non-Javadoc)                                                    
     * @see java.lang.Object#toString()                                 
     */
    @Override
    public String toString() {
	String ret="";
	ret += Integer.toString(this.sNumber);
	for(int i=0; i<10; i++) {
	    ret += " " + Integer.toString(this.grades[i]);
	}
	return ret;
    }
}
