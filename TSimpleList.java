//TSimpleList.java

public class TSimpleList <T>
{

    private final static int maxDefault = 100;
    private int maxItems;
    private int size;
    private Object [] items;


    public TSimpleList ()
    {
      items = (T[]) new Object [maxDefault];
      size = 0;
      maxItems = maxDefault;
    }

    public TSimpleList(int numElements) 
    {
      items = (T[]) new Object [numElements];
      size = 0;
      maxItems = numElements;
    }


    public boolean member (T value)
    {  boolean isMember = false;

      for (int i = 0;!isMember && i < size; i++)
        if (items[i].equals(value))
                isMember = true;

      return isMember;
    }

    public void add(T newItem)
    {
      assert (size < maxItems);

      items[size] = newItem;
      size++;
    }

    public int getMaxItems() {return maxItems;}
    public int getSize() {return size;}
    public T get (int position) 
    {   
      if (position <0 || position >= size)
        throw new ArrayIndexOutOfBoundsException(position);

      return (T)items[position];}
}
