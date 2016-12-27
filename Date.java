//Date.java
//Class definition for a simple date type

public class Date implements Comparable, Cloneable{

    private  int day;     //Date's day
    private  int month;   //Date's month
    private  int year;    //Date's year


    //constructors
    public Date (int d, int m, int y) 
    /**preconditions  m/d/y is a valid date (does no validation checks!)
       postconditions Date to day => d, month => m and year => y 
       @param d -- the day 
       @param m -- the month
       @param y -- the year
       repsonses -- if invalid date the erroronous data is simply passed on*/
    { day = d;
    month = m;
    year = y;
    }
  
    public Date (int d, int m)
    /**precondition m/d is valid
       postconditions day=d, month=m, year => 2000
       repsonses erroronous data passed on
       @param d -- the day
       @param m -- the month*/
    { day = d;
    month = m;
    year = 2000;
    }

    public Date (int d)
    /**preconditions d is valid
       postconditions day=d, year => 2000, month => 12
       responses erroronous data passed on
       @param d -- the day*/
    { day = d;
    month = 12;
    year = 2000;
    }

    public Date ()
    /**null constructor 
       preconditions none
       postcondtitions -- initializes date to 31/12/2000*/
    { day = 31;
    month =12;
    year = 2000;
    }

    //mutators
    /**function to change the day to next day*/
    public void advance ()
    {
	day ++;      //advance one day
	switch (month)
	    { case 1: case 3: case 5: case 7: case 8: case 10:
		  //Jan, mar, may. july, aug, oct => 31 days
		  if (day == 32)
		      { day = 1;
		        month++;
		      }break;
	    case 12:
		// december must change year as well
		if (day == 32)
		    {day = 1;
		    month = 1;
		    year ++;
		    }break;
	    case 4: case 6: case 9: case 11:
		//apr, june, sept, nov => 30 days
		if (day == 31)
		    { day =1;
		    month++;
		    }break;
	    case 2:
		//Feb. leap year question
		if (day > 29 || day == 29 && 
		    (year % 4 > 0  || year % 100 == 0) && year % 400 > 0)
		    { day = 1;
		      month = 3;
		    }break;
	    }
    }

    //accessors
    public int getDay () 
    {//day of this date
	return day;
    }

    public int getMonth ()
    {//month of this date
	return month;
    }

    public int getYear ()
    {// year of this date
	return year;
    }

    //functions to print date
    public void printdate()
    { System.out.print (month + "/" + day + "/" + year);
    }

    public void printdate2()
    {
	switch (month)
	    {
	    case 1:
		System.out.print ("January ");
		break;
	    case 2:
		System.out.print ("Febuary ");
		break;
	    case 3:
		System.out.print ("March ");
		break;
	    case 4:
		System.out.print ("April ");
		break;
	    case 5:
		System.out.print ("May ");
		break;
	    case 6:
		System.out.print ("June ");
		break;
	    case 7:
		System.out.print ("July ");
		break;
	    case 8:
		System.out.print ("August ");
		break;
	    case 9:
		System.out.print ("September ");
		break;
	    case 10:
		System.out.print ("October ");
		break;
	    case 11:
		System.out.print ("November ");
		break;
	    case 12:
		System.out.print ("December ");
		break;
	    }
  
	System.out.print (day + ", " + year);
    }


    //function to test equality
    public boolean equals(Object d1)
    { return ( d1 instanceof Date && day == ((Date)d1).day &&
      month == ((Date)d1).month &&
      year == ((Date)d1).year);
    }

    //method to return the date as a string
    public String toString()
    { return day + "/" + month + "/" + year;
    }

    //method to determine if one date is before another
    public boolean before (Date d1)
    { return (year < d1.year || (year == d1.year && month < d1.month) 
	      || (year == d1.year && month == d1.month && day < d1.day));
    } 
    
    //method to determine if one date is after another
    public boolean after (Date d1)
    { return (!before(d1) && !equals(d1));
    }

    
    /**method to compare two dates
       @throws ClassCastException if d1 is not a Date
    */
    public int compareTo (Object d1)
    {   int x;


	Date other = (Date) d1;
	if (equals(other))
	      x = 0;
	    else if (before(other))
	       x = -1;
	       else x = 1;
	
	return x;
    }

    //method to clone a Date
    public Object clone()
    {
	Date cloned = new Date(day,month,year);
	return cloned;
    }
}




