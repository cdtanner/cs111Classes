//Frac.java
//Class definition for a simple fraction type

public class Fraction implements Cloneable, Comparable
{
  private int numerator;
  private int denominator;

  
  //constructors
    public Fraction(int n, int d){}
    public Fraction (){}
    public Fraction(int n){}
    
    //accessors
    public int getNumerator(){}
    public int getDenominator(){}
    
    //manipulators
    public Fraction Add(Fraction f1){}
    public Fraction Substract(Fraction f1){}
    public Fraction Multiply(Fraction f1){}
    public Fraction Divide(Fraction f1){}

    public String toString()
    
    public boolean equals(Object f1)
    {  boolean eq = false;
      //create new fractions so you don't change the values of the exisiting fractions
	if (f1 instanceof Fraction)
	    { Fraction f = new Fraction (numerator,denominator);
		f.lowestTerm();
		Fraction f2 = new Fraction (((Fraction)f1).numerator,
					    ((Fraction)f1).denominator);
		f2.lowestTerm();
		eq =(f.numerator == f2.numerator && f.denominator == f2.denominator);
	    }
	return eq;
    }
     
    public int compareTo (Object f1)
    {   double c=0;
	double b=0;
	double a = numerator/denominator;
	if (f1 instanceof Fraction) 
		b = ((Fraction)f1).numerator/((Fraction)f1).denominator;
	c = a-b;
	return (int) c;
    }

    public Object clone()
    {
	Fraction a = new Fraction (numerator, denominator);
	return a;
    }

    public static int gcd(int a, int b) 
    public void lowestTerm()
}                           