//UseDate.java
//cs111 sample program using the date class

import java.util.Scanner;

public class UseDate
{

    public static void main(String [] args)
    {
	Scanner valueIn = new Scanner(System.in);   
	//declare objects of type date
	Date d1 = new Date(20,2,2006); 
	Date d2 = new Date(20,1,2006); 
	Date d3 = new Date();
	Date today = new Date();
	int day, month, year;
  
	//display the created dates
	d1.printdate();
	System.out.println();
	d2.printdate();
	System.out.println();
	d3.printdate();
	System.out.println();
  
	//advance d3 to the next day
	System.out.println("advancng the date");
	d3.advance();
	d3.printdate2();
	System.out.println();

	//check toString
	System.out.println("the date as a string is: " + d3);

	//check equal function
	if (d1.equals(d2))
	    System.out.println("its midterm, my time passes quickly");
	else System.out.println("still a ways to go!");

	//enter today's date
	System.out.print("enter today's date: \nmonth> ");
	month = valueIn.nextInt();
	System.out.print("day> ");
	day= valueIn.nextInt();
	System.out.print ("year> ");
	year = valueIn.nextInt();

	//assign today the input date
	today = new Date(day, month, year);
	today.printdate2();
	System.out.println();
	
	//use comparison methods
	if (today.compareTo(d1) == 0)
	    System.out.println("equal");
	else if (today.compareTo(d1) < 0)
	    System.out.println("less than");
	else System.out.println ("greater than");

	//demonstrate the problem with =
	d1 = today;
	System.out.print("d1 is = ");
	d1.printdate();
	d1.advance();
	System.out.print("\nd1 is now ");
	d1.printdate();
	System.out.print("\ntoday is ");
	today.printdate();
	System.out.println();
	
	//use the clone method
	Date d = (Date)today.clone();
	System.out.print("d is = ");
	d.printdate();
	d.advance();
	System.out.print("\nd is now ");
	d.printdate();
	System.out.print("\ntoday is still: ");
	today.printdate();
	System.out.println();
    }
}
