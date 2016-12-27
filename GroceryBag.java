public class GroceryBag
{
    private int [] theBag;
    private int numInBag;

    public GroceryBag()
    {
	theBag= new int[100];
	numInBag=0;
    }
    
    public boolean placeInBag(int item);
    public boolean removeFromBag (int item);
    public boolean removeLastItem();
    public boolean removeRandom();
    public int numItems();
    public boolean full();
    public boolean empty();
    public String toString();
    public void clear()
    {
	numInBag =0;
    }
}
