//Test generic ThreeThings class 

public class TestThreeThings
{
  
  public static void main(String [] agrs)
  {
    ThreeThings<Integer> intT = new ThreeThings<Integer> (5,6,7);
    System.out.println("The Largest int is: " + intT.largest());
    System.out.println("The Smallest int is: " + intT.smallest());
                       
    ThreeThings<String> stringT = new ThreeThings<String> ("tom","jane","abby");
    System.out.println("The Largest string is: " + stringT.largest());
    System.out.println("The Smallest string is: " + stringT.smallest());

    Fraction a = new Fraction (3,4);
    Fraction b = new Fraction (2,3);
    Fraction c = new Fraction (1,2);
    ThreeThings<Fraction> fracT = new ThreeThings<Fraction> (a,b,c);
    System.out.println("The Largest fraction is: " + fracT.largest());
    System.out.println("The Smallest fraction is: " + fracT.smallest());
                      

    Date d = new Date (9,21,2018);
    Date e = new Date (9,28,2018);
    Date f = new Date (10,1,2010);
    ThreeThings<Date> dateT = new ThreeThings<Date> (d,e,f);
    System.out.println("The Largest date is: " + dateT.largest());
    System.out.println("The Smallest date is: " + dateT.smallest());

  }
}