//Machine.java
//CS111 sample class heirarchy

public class Machine implements Cloneable
{
    private String serialNumber;
    
    public Machine (String sn)
    {
	serialNumber = sn;
    }

    public String getSerialNumber() {return serialNumber;}
    
    public String toString()
    {
	return "\nSerial Number: " + serialNumber;
    }

    public boolean equals(Object o)
    {
	return (o instanceof Machine && (((Machine)(o)).serialNumber).equals(serialNumber));
    }

    public Object clone()
    {
	Machine cloned = new Machine (serialNumber);
	return cloned;
    }
}
