/**
 * @(#)Fraction.java
 * @CS 110 Sample Program 
 * @10-07-08
 */
 
import java.util.Scanner;

//Fraction.java
//Class definition for a simple fraction type

public class Fraction implements Cloneable, Comparable
{
  private int numerator;
  private int denominator;
  private Scanner sc= new Scanner (System.in);
  
  //constructors
    public Fraction(int n, int d)
    {
     numerator = n;
     denominator = d;
    }
    
    public Fraction ()
    {
      numerator=0;
      denominator=1;
    }

    public Fraction(int n)
    {
     numerator = n;
     denominator = 1;
    }
    
  //accessors
    public int getNumerator()
    {
     return numerator;
    }
    
    public int getDenominator()
    {
     return denominator;
    }
    
    //manipulators
    public Fraction Add(Fraction f1)
    {
     int n = numerator *f1.denominator + denominator * f1.numerator;
     int d = denominator * f1.denominator;
     Fraction f2 = new Fraction(n, d);
     return f2; 
    }
    
    public Fraction Substract(Fraction f1)
    {
     int n = numerator * f1.denominator - denominator * f1.numerator;
     int d = denominator * f1.denominator;
     Fraction f2 = new Fraction(n, d);
     return f2; 
    }
    
    public Fraction Multiply(Fraction f1)
    {
     int n = numerator * f1.numerator;
     int d = denominator * f1.denominator;
     Fraction f2 = new Fraction(n, d);
     return f2; 
    }
    
    public Fraction Divide(Fraction f1)
    {
     int n = numerator * f1.denominator;
     int d = denominator * f1.numerator;
     Fraction f2 = new Fraction(n, d);
     return f2; 
    }
    
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
    {
     
        if (a < b) 
        {         
         int t = a;
         a = b;
         b = t;
        }
	int temp=b;
	while (a%b !=0)
	    {
		temp = a;
	    a = b;
	    b = temp%b;
	    }
	return b;
    }

    
    public String toString()
    {
     return numerator + "/" + denominator;
    }
    
    //mutators
    public void lowestTerm()
    {
     int g = gcd(numerator, denominator);
     
     numerator/=g;
     denominator/=g;
    }
        
    public void inputFraction()
    {
      String frac;
      int position;
      
      frac = sc.next();
      position = frac.indexOf('/');
      numerator = Integer.parseInt(frac.substring (0,position));
      denominator = Integer.parseInt(frac.substring(position+1));
      
    }
    
    public void setNumerator(int n)
    {
      numerator = n;
    }
    
    public void setDenominator(int d)
    {
      denominator = d;
    }
    
    public void setFraction (int n, int d)
    {
      numerator =n;
      denominator=d;
    }
}                           