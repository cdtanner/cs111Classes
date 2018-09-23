//Generic class for working with three objects

public class ThreeThings <T extends Comparable>
{
  private T thingOne;
  private T thingTwo;
  private T thingThree;
  
  public ThreeThings(T one, T two, T three)
  {
    thingOne = one;
    thingTwo = two;
    thingThree = three;
  }
    
  public T largest()
  {
    T max=thingOne;
    
    if (thingTwo.compareTo(max) > 0)
      max = thingTwo;
    if (thingThree.compareTo(max) > 0)
      max = thingThree;
    
    return max;
  }
  public T smallest()
  {
    T min=thingOne;
    
    if (min.compareTo(thingTwo) > 0)
      min = thingTwo;
    if (min.compareTo(thingThree) >0)
      min= thingThree;
    
    return min;
  }
}
  
  
    