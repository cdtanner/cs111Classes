public class Rectangle implements Comparable, Cloneable
{

    private double length;
    private double width;

    public Rectangle();
    public Rectangle(double l, double w);
    public double getLength();
    public double getWidth();
    public double area();
    public double perimeter();
    public double diameter();
    public boolean isSquare();
    public boolean isGolden();
    public void printRectangle();
    public void resize(double l,double w); 
    public String toString()
    { return length + " x " + width;}
    public boolean equals (Object r)
    {
	return (r instanceof Rectangle && 
	((length == ((Rectangle)r).length && width == ((Rectangle)r).width)
      || (length == ((Rectangle)r).width && width == ((Rectangle)r).length))); 
    }	
    public Object clone()
    {   Object r;
	r = new Rectangle(length, width);
	return r;
    }
    public int compareTo (Object r)
    {   int i=0;
	Rectangle newR;
	if (r instanceof Rectangle)
	    { newR = (Rectangle)r;
		i = area() - newR.area();
	    }
	return i;
    }
}
