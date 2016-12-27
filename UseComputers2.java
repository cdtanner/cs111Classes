public class UseComputers2
{
    public static void main (String [] args)
    {
	LapTop theComputer = new LapTop ("12345","Dell", "Celeron", 512, 60, 15.1,7.2,6.5);
	System.out.println(theComputer);


	theComputer = new Computer  ("12345","Dell","Pentium 4",1024, 60);
	System.out.println(theComputer);
    }
}
