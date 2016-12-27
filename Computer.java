//Computer.java
//CS111 sample class heirarchy

public class Computer extends Machine
{
    private String manufacturer;
    private String processor;
    private int ramSize;
    private int diskSize;

    public Computer (String s,String m, String p, int rs, int ds)
    {
	super(s);
	manufacturer = m;
	processor = p;
	ramSize = rs;
	diskSize = ds;
    }

    public int getRamSize() { return ramSize;}
    public int getDiskSize() { return diskSize;}
    public String getProcessor() {return processor;}
    public String getManufacturer() {return manufacturer;}

    public String toString()
    {
	return super.toString() + "\nManufacturer: " + manufacturer +
	    "\nCPU: " + processor +
	    "\nRam: " + ramSize +
	    "\nDisk: " + diskSize;
    }

    public boolean equals(Object o)
    {   boolean eq;
	if (o instanceof Computer)
	{
	    Computer other = (Computer) o;
	    eq = super.equals(other) &&
		    other.ramSize == ramSize && other.diskSize == diskSize 
		    && other.processor.equals(processor)
		    && other.manufacturer.equals(manufacturer);
	}
        else eq = false;
	return eq;
    }

    public Object clone()
    {
    	Computer cloned = new Computer (getSerialNumber(),manufacturer, processor, ramSize, diskSize);
    	return cloned;
    }
}
