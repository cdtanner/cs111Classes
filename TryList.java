

public class TryList
{

    public static void main(String [] args)
    {

 TSimpleList<Integer> intList = new TSimpleList<Integer>(3); //declares integer list of 10 elements
 TSimpleList<Double> doubleList = new TSimpleList<Double>();//declares a double list 100 elements
 TSimpleList<String> stringList = new TSimpleList<String>(15);//declares a string list of 15 elements



 intList.add(5);   // add 5 to the list;
 intList.add(7);
 intList.add(25);


 System.out.println("IntList Max. number items: " + intList.getMaxItems());
 System.out.println ("IntList Current size: " + intList.getSize());
 System.out.println("IntList Space left: " + (intList.getMaxItems() - intList.getSize()));
 

 if (!intList.member(25))
     intList.add(25);
 System.out.println("contents of intList");
 for (int i=0;i<intList.getSize();i++)
     System.out.println(intList.get(i));

 System.out.println("DoubleList Max: " +doubleList.getMaxItems());

 stringList.add("cs111");

 System.out.println (stringList.get(0));

    }
}
