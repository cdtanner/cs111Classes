//UseComputers.java
//CS111 sample program to use a class hierarchy

public class UseComputers
{
    public static void main (String [] args)
    {
	Machine theComputer = new Machine ("x1234");
	System.out.println(theComputer);


	theComputer = new LapTop ("Y1234","Dell", "Celeron", 512, 60, 15.1,7.2,6.5);
	System.out.println(theComputer);
	
	

	LapTop justBought = (LapTop)theComputer.clone();

	System.out.print("\nI Just Bought a...");
	System.out.println(justBought);

	System.out.println("comparing the orginial and the clone");
	if (theComputer.equals(justBought))
	    System.out.println ("they are the same");
	else System.out.println ("they are different");

	theComputer = new LapTop ("Z1234","Dell", "Centrino",1024, 60, 15.1,7.2,1.5);
	System.out.print("\nBought Another");
	System.out.println(theComputer);
	System.out.println("Comparing the clone with the new one");
	if (theComputer.equals(justBought))
	    System.out.println ("they are the same");
	else System.out.println ("they are different");


    }
}
