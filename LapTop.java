//LapTop.java
//CS 111 sample class heirarchy

public class LapTop extends Computer 
{
    private double screenSize;
    private double weight;
    private double batteryLife;

    public LapTop (String s,String man, String p, int ram, int disk, double screen, double wth, double bl)
    {
	super(s,man,p,ram,disk);
	screenSize = screen;
	weight = wth;
	batteryLife = bl;
    }
    
    public String toString()
    {
	return super.toString() +
	    "\nScreen: " + screenSize +
	    "\nWeight: " + weight +
	    "\nBattery Life: " + batteryLife;
    }

    public boolean equals (Object o)
    {   boolean eq;
	if (o instanceof LapTop)
	    {LapTop other = (LapTop) o;
	     eq = super.equals(other) && weight == other.weight &&
		batteryLife == other.batteryLife && screenSize == other.screenSize;
	    }
	else eq = false;
	return eq;
    }

    public Object clone()
    {
    	LapTop cloned = new LapTop (getSerialNumber(),getManufacturer(), getProcessor(), 
				    getRamSize(), getDiskSize(), screenSize,weight, batteryLife);
	return cloned;
    }
}
