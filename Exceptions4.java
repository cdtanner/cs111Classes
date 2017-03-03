//Exceptions4.java
//cs111 sample programto demonstrate exception handling

import java.util.Scanner;
import java.io.IOException;

public class Exceptions4
{

  public static class InvalidNumberException extends Exception
  { 
      public InvalidNumberException(String s) 
      { super (s);}
  }
      

    public static void main(String [] args)
    {
	int number;
	boolean inrange = false;

	Scanner sc = new Scanner(System.in);

	while (!inrange)
	    {try
		{
		    System.out.print ("enter a number between 1-10 ");
		    number = sc.nextInt();
		    inrange = (number >=1 && number <=10);
		    if (!inrange) throw new InvalidNumberException("number not between 1-10");
		}
	    catch (InvalidNumberException ex)
		{
                    System.out.println(ex.getMessage());
		    System.out.println ("The number must be between 1-10");
		    //System.out.println("Illegal value entered please reenter");
		}
	    catch (Exception ex)
		{
		    System.out.println(ex.getMessage());
		    System.err.println(ex);
		    inrange=false;
		    System.out.println("Illegal value entered please reenter");
		    sc.nextLine();
		}
	    }
    }
}
